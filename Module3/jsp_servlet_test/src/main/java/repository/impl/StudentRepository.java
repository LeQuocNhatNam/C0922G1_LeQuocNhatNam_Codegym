package repository.impl;

import model.Book;
import model.Student;
import repository.BaseRepository;
import repository.IStudentRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static final String SELECT_ALL_STUDENT = "select * from student;";
    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_STUDENT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
               int id = resultSet.getInt("id");
               String name = resultSet.getString("name");
               String className = resultSet.getString("class_name");
               studentList.add(new Student(id,name,className));
            }
            return studentList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
