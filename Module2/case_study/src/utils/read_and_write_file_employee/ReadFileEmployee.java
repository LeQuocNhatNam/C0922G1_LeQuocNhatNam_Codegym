package utils.read_and_write_file_employee;

import models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileEmployee {
    public static List<Employee> readFile(String pathName) {
        List<Employee> list = new ArrayList<>();
        File file = new File(pathName);
        if (!file.exists()) {
            return list;
        }
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            String[] lineArr;
            while ((line = bufferedReader.readLine()) != null) {
                lineArr = line.split(",");
                Employee employee = new Employee(lineArr[0], lineArr[1], lineArr[2], lineArr[3], lineArr[4], lineArr[5],
                        Integer.parseInt(lineArr[6]), lineArr[7], lineArr[8], Double.parseDouble(lineArr[9]));
                list.add(employee);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return list;
    }
}
