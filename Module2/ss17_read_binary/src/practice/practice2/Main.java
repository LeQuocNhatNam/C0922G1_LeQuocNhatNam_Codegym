package practice.practice2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToObject(String path, List<Student> studentList) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentList);
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        List<Student> studentList =new ArrayList<>();
        studentList.add(new Student(1,"Nam","HTM"));
        studentList.add(new Student(2,"Nam1","HTM1"));
        studentList.add(new Student(3,"Nam2","HTM2"));
        studentList.add(new Student(4,"Nam3","HTM3"));
        writeToObject("student.txt",studentList);
        List<Student> students = readDataFromFile("student.txt");
        for (Student student: students) {
            System.out.println(student);
        }

    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> studentList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            studentList = (List<Student>) objectInputStream.readObject();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return studentList;
    }
}
