package model.student_service;

import java.io.IOException;
import java.util.List;

public interface IStudentIOService {
    List<Student> readFile(String pathName, boolean checkFileNotFound) throws IOException;


    void writeFile(String pathName, List<Student> list) throws IOException;
}
