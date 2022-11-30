package model.student_service.impl;

import model.Student;
import model.student_service.IStudentIOService;
import model.student_service.IStudentService;

import java.io.*;
import java.util.List;

public class StudentServiceImpl implements IStudentService {
    private final String PATH_NAME = "src/model/repository/student_database.csv";
    private IStudentIOService iStudentIOService = new StudentIOServiceImpl();

    @Override
    public void addStudent(Student student) throws IOException {
        List<Student> studentList = this.iStudentIOService.readFile(PATH_NAME, false);
        studentList.add(student);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH_NAME));
        for (Student st : studentList) {
            bufferedWriter.write(st.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        System.out.println("Successful!");
    }

    @Override
    public List<Student> getStudents() throws IOException {
        return this.iStudentIOService.readFile(PATH_NAME, true);
    }

    @Override
    public void deleteStudent(int id) throws IOException {
        List<Student> studentList = this.iStudentIOService.readFile(PATH_NAME,true);
    }

    @Override
    public void editStudent(Student student) {

    }
}
