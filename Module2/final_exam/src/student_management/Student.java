package student_management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private String studentID;
    private String StudentName;
    private String phoneNumber;
    private String dateOfBirth;
    private String className;

        //tạo đối tượng
    public Student() {
    }

    public Student(String studentID, String studentName, String phoneNumber, String dateOfBirth, String className) {
        this.studentID = studentID;
        StudentName = studentName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public String toStringCSV() {
        return this.getStudentID() + "," + this.getStudentName() + "," + this.getPhoneNumber() + "," + this.getDateOfBirth()+
                "," + this.className;
    }
}
