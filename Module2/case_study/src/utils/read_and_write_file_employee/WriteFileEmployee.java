package utils.read_and_write_file_employee;

import models.person.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileEmployee {
    public static void writeFile(String pathName, List<Employee> employeeList) {
        File file = new File(pathName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.toStringCSV());
                bufferedWriter.flush();
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
