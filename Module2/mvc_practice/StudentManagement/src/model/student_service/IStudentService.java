package model.student_service;

import model.exceptions.NotFoundStudentException;

import java.io.IOException;
import java.util.List;

public interface IStudentService {

    void addStudent(Student student) throws IOException;

    List<Student> getStudents() throws IOException;

    void deleteStudent(int id) throws IOException, NotFoundStudentException;

    void editStudent(Student student);

}
