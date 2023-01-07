package repository.impl;

import model.Clazz;
import model.Student;
import model.Student1;
import repository.BaseRepository;
import repository.IStudentRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static final String SELECT_ALL_JOIN = "select s.*, c.class_name as class_name from students s join class c on s.class_id = c.class_id";
    private static final String SELECT_BY_ID = "";

    @Override
    public List<Student1> findAll() {
        List<Student1> student1List = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_JOIN);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                boolean gender = resultSet.getBoolean("gender");
                float point = resultSet.getFloat("point");
                int classId = resultSet.getInt("class_id");
                String className = resultSet.getString("class_name");
                Clazz clazz = new Clazz(classId, className);
                student1List.add(new Student1(id, name, gender, point, clazz));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student1List;
    }

    @Override
    public Student findById(int id) {
//        Connection connection = BaseRepository.getConnectDB();
//        PreparedStatement preparedStatement = connection.prepareStatement()
        return null;
    }

    @Override
    public boolean save(Student1 student1) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
