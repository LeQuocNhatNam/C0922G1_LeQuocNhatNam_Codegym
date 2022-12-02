package model.student_service.impl;

import model.student_service.Student;
import model.exceptions.NotFoundStudentException;
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
    public void deleteStudent(int id) throws IOException, NotFoundStudentException {
        Student deletedStudent = null;
        List<Student> studentList = this.iStudentIOService.readFile(PATH_NAME,true);
        for (Student st: studentList){
            if (st.getId() == id){
                deletedStudent = st;
                break;
            }
        }
        if (deletedStudent == null){
            throw new NotFoundStudentException();
        }
        studentList.remove(deletedStudent);
        this.iStudentIOService.writeFile(PATH_NAME,studentList);
    }

    @Override
    public void editStudent(Student student) {

    }
}
