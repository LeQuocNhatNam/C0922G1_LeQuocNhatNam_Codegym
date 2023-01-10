package repository.facility.impl;

import model.facility.FacilityType;
import repository.BaseRepository;
import repository.facility.IFacilityTypeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacilityTypeRepository implements IFacilityTypeRepository {
    private static final String SELECT_FACILITY_TYPES = "select * from facility_type";
    @Override
    public List<FacilityType> findAll() {
        List<FacilityType> facilityTypeList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FACILITY_TYPES);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                facilityTypeList.add(new FacilityType(id,name));
            }
            return facilityTypeList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
