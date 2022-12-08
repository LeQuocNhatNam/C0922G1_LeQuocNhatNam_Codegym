package utils.read_and_write_file_customer;

import models.person.Customer;
import models.person.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class WriteFileCustomer {
    public static void writeFile(String pathName, LinkedList<Customer> customerList) {
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
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.toStringCSV());
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
