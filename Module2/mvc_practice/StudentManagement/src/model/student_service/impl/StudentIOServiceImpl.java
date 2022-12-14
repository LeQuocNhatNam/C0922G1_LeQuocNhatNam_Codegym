package model.student_service.impl;

import model.student_service.Student;
import model.student_service.IStudentIOService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentIOServiceImpl implements IStudentIOService {
    @Override
    public List<Student> readFile(String pathName, boolean checkFileNotFound) throws FileNotFoundException {
        File file = new File(pathName);
        if (!file.exists()) {
            if (checkFileNotFound) {
                throw new FileNotFoundException("Find not found");
            }
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Student> students = new ArrayList<>();
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                students.add(new Student(Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2])));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }


    @Override
    public void writeFile(String pathName, List<Student> list) throws IOException {
        File file = new File(pathName);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName));
        for (Student st : list) {
            bufferedWriter.write(st.getInfo());
        }
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
