package model.student_service;

import model.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IStudentIOService {
    List<Student> readFile(String pathName, boolean checkFileNotFound) throws IOException;

    void writeFile(String pathName, Student student) throws IOException;
}
