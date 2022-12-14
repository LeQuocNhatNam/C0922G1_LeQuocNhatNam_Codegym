package student_management;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileStudent {

    public static List<Student> readFileStudent(String pathName) {
        List<Student> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(pathName);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] lineArr = line.split(",");
                list.add(new Student(lineArr[0],lineArr[1],lineArr[2],lineArr[3],lineArr[4]));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return list;
    }
}
