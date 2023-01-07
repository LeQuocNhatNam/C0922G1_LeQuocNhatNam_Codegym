package repository.impl;

import model.Clazz;
import repository.BaseRepository;
import repository.IClazzRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClazzRepository implements IClazzRepository {

    @Override
    public List<Clazz> findByAll() {
        List<Clazz> clazzList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select*from class");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id =resultSet.getInt("class_id");
                String className = resultSet.getString("class_name");
                clazzList.add(new Clazz(id,className));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clazzList;
    }
}
