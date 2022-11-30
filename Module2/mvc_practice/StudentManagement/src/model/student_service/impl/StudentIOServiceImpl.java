package model.student_service.impl;

import model.Student;
import model.student_service.IStudentIOService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentIOServiceImpl implements IStudentIOService {
    @Override
    public List<Student> readFile(String pathName, boolean checkFileNotFound) throws IOException {
        File file = new File(pathName);
        if (!file.exists()) {
            if (checkFileNotFound) {
                throw new FileNotFoundException("Find not found");
            }
            file.createNewFile();
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Student> students = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] str = line.split(",");
            students.add(new Student(Integer.parseInt(str[0]),str[1],Integer.parseInt(str[2])));
        }
        bufferedReader.close();
        fileReader.close();
        return students;
    }

    @Override
    public void writeFile(String pathName, Student student) throws IOException {
        File file = new File(pathName);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName));
        bufferedWriter.write(student.getInfo());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
