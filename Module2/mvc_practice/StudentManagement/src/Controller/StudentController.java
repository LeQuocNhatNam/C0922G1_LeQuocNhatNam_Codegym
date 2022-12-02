package Controller;

import model.student_service.IStudentIOService;
import model.student_service.IStudentService;
import model.student_service.Student;
import model.student_service.impl.StudentIOServiceImpl;
import model.student_service.impl.StudentServiceImpl;

import java.io.IOException;

public class StudentController {
    private IStudentService iStudentService = new StudentServiceImpl();
    //add,get,delete,edit

    public void addStudent(Student student) throws IOException {
       this.iStudentService.addStudent(student);
    }

}
