package repository.facility.impl;

import model.facility.Facility;
import model.facility.FacilityType;
import model.facility.RentType;
import repository.BaseRepository;
import repository.facility.IFacilityRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacilityRepository implements IFacilityRepository {
    private static final String SELECT_ALL_FACILITIES = "select f.*,ft.name as facility_name_type, rt.name as rent_type from facility f join facility_type ft on f.facility_type_id = ft.id join rent_type rt on f.rent_type_id = rt.id";
    private static final String SAVE_FACILITY = "INSERT INTO facility (name, area, cost, max_people, rent_type_id, facility_type_id, standard_room, description_other_convenience, pool_area, number_of_floors, facility_free) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SELECT_FACILITY_BY_ID = "select f.*,ft.name as facility_name_type, rt.name as rent_type from facility f join facility_type ft on f.facility_type_id = ft.id join rent_type rt on f.rent_type_id = rt.id where f.id = ?";
    private static final String UPDATE_FACILITY = " update facility set name= ?, area = ?, cost = ?, max_people = ?, rent_type_id = ?, facility_type_id = ?, standard_room = ?, description_other_convenience = ?, pool_area = ?, number_of_floors = ?, facility_free = ? where id = ?";
    private static final String DELETE_FACILITY_BY_ID = " delete from facility where id = ?";
    private static final String SEARCH_FACILITY = "select f.*,ft.name as facility_name_type, rt.name as rent_type from facility f join facility_type ft on f.facility_type_id = ft.id join rent_type rt on f.rent_type_id = rt.id where f.name like ? and ft.id like ?";

    @Override
    public List<Facility> findAll() {
        List<Facility> facilityList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_FACILITIES);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int area = resultSet.getInt("area");
                double cost = resultSet.getDouble("cost");
                int maxPeople = resultSet.getInt("max_people");
                int rentTypeId = resultSet.getInt("rent_type_id");
                int facilityTypeId = resultSet.getInt("facility_type_id");
                String standardRoom = resultSet.getString("standard_room");
                String otherDescription = resultSet.getString("description_other_convenience");
                double poolArea = resultSet.getDouble("pool_area");
                int numberOfFloors = resultSet.getInt("number_of_floors");
                String freeFacility = resultSet.getString("facility_free");
                String facilityTypeName = resultSet.getString("facility_name_type");
                String rentTypeName = resultSet.getString("rent_type");
                FacilityType facilityType = new FacilityType(facilityTypeId, facilityTypeName);
                RentType rentType = new RentType(rentTypeId, rentTypeName);
                Facility facility = new Facility(id, name, area, cost, maxPeople, standardRoom, otherDescription, poolArea,
                        numberOfFloors, freeFacility, facilityType, rentType);
                facilityList.add(facility);
            }
            return facilityList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean saveFacility(Facility facility) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_FACILITY);
            preparedStatement.setString(1, facility.getName());
            preparedStatement.setInt(2, facility.getArea());
            preparedStatement.setDouble(3, facility.getCost());
            preparedStatement.setInt(4, facility.getMaxPeople());
            preparedStatement.setInt(5, facility.getRentTypeId());
            preparedStatement.setInt(6, facility.getFacilityTypeId());
            preparedStatement.setString(7, facility.getStandardRoom());
            preparedStatement.setString(8, facility.getOtherConvenience());
            preparedStatement.setDouble(9, facility.getPoolArea());
            preparedStatement.setInt(10, facility.getNumberOfFloors());
            preparedStatement.setString(11, facility.getFreeFacility());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Facility findFacilityById(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FACILITY_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Facility facility = null;
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                int area = resultSet.getInt("area");
                double cost = resultSet.getDouble("cost");
                int maxPeople = resultSet.getInt("max_people");
                int rentTypeId = resultSet.getInt("rent_type_id");
                int facilityTypeId = resultSet.getInt("facility_type_id");
                String standardRoom = resultSet.getString("standard_room");
                String otherDescription = resultSet.getString("description_other_convenience");
                double poolArea = resultSet.getDouble("pool_area");
                int numberOfFloors = resultSet.getInt("number_of_floors");
                String freeFacility = resultSet.getString("facility_free");
                String facilityTypeName = resultSet.getString("facility_name_type");
                String rentTypeName = resultSet.getString("rent_type");
                FacilityType facilityType = new FacilityType(facilityTypeId, facilityTypeName);
                RentType rentType = new RentType(rentTypeId, rentTypeName);
                facility = new Facility(id, name, area, cost, maxPeople, standardRoom, otherDescription, poolArea,
                        numberOfFloors, freeFacility, facilityType, rentType);
            }
            return facility;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean updateFacility(Facility facility) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_FACILITY);
            preparedStatement.setString(1, facility.getName());
            preparedStatement.setInt(2, facility.getArea());
            preparedStatement.setDouble(3, facility.getCost());
            preparedStatement.setInt(4, facility.getMaxPeople());
            preparedStatement.setInt(5, facility.getRentTypeId());
            preparedStatement.setInt(6, facility.getFacilityTypeId());
            preparedStatement.setString(7, facility.getStandardRoom());
            preparedStatement.setString(8, facility.getOtherConvenience());
            preparedStatement.setDouble(9, facility.getPoolArea());
            preparedStatement.setInt(10, facility.getNumberOfFloors());
            preparedStatement.setString(11, facility.getFreeFacility());
            preparedStatement.setInt(12, facility.getId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean deleteFacility(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_FACILITY_BY_ID);
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Facility> searchFacility(int facilityTypeIdSearch, String nameSearch) {
        List<Facility> facilityList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_FACILITY);
            preparedStatement.setString(1, "%" + nameSearch + "%");
            preparedStatement.setString(2, "%" +  facilityTypeIdSearch + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int area = resultSet.getInt("area");
                double cost = resultSet.getDouble("cost");
                int maxPeople = resultSet.getInt("max_people");
                int rentTypeId = resultSet.getInt("rent_type_id");
                int facilityTypeId = resultSet.getInt("facility_type_id");
                String standardRoom = resultSet.getString("standard_room");
                String otherDescription = resultSet.getString("description_other_convenience");
                double poolArea = resultSet.getDouble("pool_area");
                int numberOfFloors = resultSet.getInt("number_of_floors");
                String freeFacility = resultSet.getString("facility_free");
                String facilityTypeName = resultSet.getString("facility_name_type");
                String rentTypeName = resultSet.getString("rent_type");
                FacilityType facilityType = new FacilityType(facilityTypeId, facilityTypeName);
                RentType rentType = new RentType(rentTypeId, rentTypeName);
                Facility facility = new Facility(id, name, area, cost, maxPeople, standardRoom, otherDescription, poolArea,
                        numberOfFloors, freeFacility, facilityType, rentType);
                facilityList.add(facility);
            }
            return facilityList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
