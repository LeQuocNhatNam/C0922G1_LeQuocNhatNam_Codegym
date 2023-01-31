package repository.contract.impl;

import model.contract.AttachFacility;
import model.contract.CustomerUsingService;
import repository.BaseRepository;
import repository.contract.IContractRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConTractRepository implements IContractRepository {
    private static final String SELECT_CUSTOMER_USING_SERVICE = "select contract.id,customer.name as customer_name, contract.start_date, contract.end_date,\n" +
            " facility.name as facility_name, contract_detail.quantity, facility.cost, attach_facility.cost as attach_facility_cost,\n" +
            " attach_facility.*,sum(attach_facility.cost * contract_detail.quantity) as sum_attach_cost, sum(facility.cost) as sum_facility_cost, contract.deposit\n" +
            " from contract \n" +
            "left join contract_detail on contract.id = contract_detail.contract_id\n" +
            "left join attach_facility on contract_detail.attach_facility_id = attach_facility.id\n" +
            "join customer on customer.id = contract.customer_id\n" +
            "join facility on facility.id = contract.facility_id group by contract.id;";
    private static final String SELECT_ALL_ATTACH_FACILITY = "select * from attach_facility";
    private static final String SELECT_ATTACH_FACILITY = "select * from contract_detail join attach_facility on contract_detail.attach_facility_id = attach_facility.id where contract_detail.contract_id = 1;";

    @Override
    public List<CustomerUsingService> findAll() {
        return null;
    }

    @Override
    public List<CustomerUsingService> findCustomerUsingService() {
        Connection connection = BaseRepository.getConnectDB();
        List<CustomerUsingService> customerUsingServiceList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_USING_SERVICE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int contractId = resultSet.getInt("id");
                String serviceName = resultSet.getString("facility_name");
                String customerName = resultSet.getString("customer_name");
                Timestamp startDate = resultSet.getTimestamp("start_date");
                Timestamp endDate = resultSet.getTimestamp("end_date");
                double deposit = resultSet.getDouble("deposit");
                double attachCost = resultSet.getDouble("sum_attach_cost");
                double facilityCost = resultSet.getDouble("sum_facility_cost");
                double total = attachCost + facilityCost;
                CustomerUsingService customerUsingService = new CustomerUsingService(contractId, serviceName, customerName, startDate, endDate, deposit, total);
                customerUsingServiceList.add(customerUsingService);
            }
            return customerUsingServiceList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<AttachFacility> findAllAttachFacility() {
        List<AttachFacility> attachFacilityList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_ATTACH_FACILITY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                AttachFacility attachFacility = new AttachFacility(id, name);
                attachFacilityList.add(attachFacility);
            }
            return attachFacilityList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean addAttachFacility(int attachFacilityId, int quantity, int contractId) {
        Connection connection = BaseRepository.getConnectDB();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("insert into contract_detail (contract_id,attach_facility_id,quantity) values (?,?,?)");
            preparedStatement.setInt(1, contractId);
            preparedStatement.setInt(2, attachFacilityId);
            preparedStatement.setInt(3, quantity);
            return preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
