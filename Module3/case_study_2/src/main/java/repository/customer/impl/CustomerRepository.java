package repository.customer.impl;

import model.customer.Customer;
import model.customer.CustomerType;
import repository.customer.ICustomerRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import repository.BaseRepository;

public class CustomerRepository implements ICustomerRepository {
    private static final String SELECT_ALL_CUSTOMERS = "select c.*, ct.name_type from customer c join customer_type ct on c.customer_type_id = ct.id order by c.id";
    private static final String INSERT_CUSTOMER = "insert into customer(customer_type_id,name,date_of_birth,gender,id_card,phone_number,email,address) values (?,?,?,?,?,?,?,?)";
    private static final String SELECT_CUSTOMER_BY_ID = "select c.*, ct.name_type from customer c join customer_type ct on c.customer_type_id = ct.id where c.id = ?";
    private static final String UPDATE_CUSTOMER = "update customer set customer_type_id = ?, name = ?," +
            "date_of_birth = ?, gender = ?,id_card = ?, phone_number = ?, email = ?, address = ?" +
            "where id = ?;";
    private static final String DELETE_CUSTOMER_BY_ID = "delete from customer where id = ?";
    private static final String SELECT_CUSTOMER_CONTRACT = "select c.name, c.date_of_birth, c.address,c.phone_number, count(c.id) as number_of_contracts  from customer c join contract ct on c.id = ct.customer_id group by ct.customer_id";

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMERS);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int customerTypeId = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("name");
                Date dateOfBirth = resultSet.getDate("date_of_birth");
                boolean gender = resultSet.getBoolean("gender");
                String idCard = resultSet.getString("id_card");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String nameType = resultSet.getString("name_type");
                CustomerType customerType = new CustomerType(customerTypeId, nameType);
                customerList.add(new Customer(id, customerType, name, dateOfBirth, gender, idCard, phoneNumber, email,
                        address));
            }
            preparedStatement.close();
            connection.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public boolean saveCustomer(Customer customer) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER);
            preparedStatement.setInt(1, customer.getCustomerTypeId());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setDate(3, customer.getDateOfBrith());
            preparedStatement.setBoolean(4, customer.isGender());
            preparedStatement.setString(5, customer.getIdCard());
            preparedStatement.setString(6, customer.getPhoneNumber());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getAddress());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Customer getCustomerById(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()) {
                int customerTypeId = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("name");
                Date dateOfBirth = resultSet.getDate("date_of_birth");
                boolean gender = resultSet.getBoolean("gender");
                String idCard = resultSet.getString("id_card");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String nameType = resultSet.getString("name_type");
                CustomerType customerType = new CustomerType(customerTypeId, nameType);
                customer = new Customer(id, customerType, name, dateOfBirth, gender, idCard, phoneNumber, email, address);
            }
            return customer;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER);
            preparedStatement.setInt(1, customer.getCustomerTypeId());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setDate(3, customer.getDateOfBrith());
            preparedStatement.setBoolean(4, customer.isGender());
            preparedStatement.setString(5, customer.getIdCard());
            preparedStatement.setString(6, customer.getPhoneNumber());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getAddress());
            preparedStatement.setInt(9, customer.getId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean deleteCustomerById(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER_BY_ID);
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Customer> findAllCustomerContract() {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_CONTRACT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                Date dateOfBirth = resultSet.getDate("date_of_birth");
                String address = resultSet.getString("address");
                String phoneNumber = resultSet.getString("phone_number");
                int numberOfContracts = resultSet.getInt("number_of_contracts");
                Customer customer = new Customer(name, dateOfBirth, address,phoneNumber, numberOfContracts);
                customerList.add(customer);
            }
            return customerList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
