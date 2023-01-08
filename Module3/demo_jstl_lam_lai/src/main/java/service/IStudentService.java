package service;

import model.Student;
import model.Student1;

import java.util.List;

public interface IStudentService {

    List<Student1> findAll();

    Student findById(int id);

    boolean save(Student1 student1);

    boolean delete(int id);
}
