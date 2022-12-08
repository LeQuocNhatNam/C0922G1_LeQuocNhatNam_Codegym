package utils.read_and_write_file_customer;

import models.person.Customer;
import models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileCustomer {
    public static LinkedList<Customer> readFile(String pathName) {
        LinkedList<Customer> list = new LinkedList<>();
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
                //String name, String dateOfBirth, String gender, String identification,
                //                    String phoneNumber, String email, int customerID, String customerType
                Customer customer = new Customer(lineArr[0],lineArr[1],lineArr[2],lineArr[3],lineArr[4],lineArr[5],
                        Integer.parseInt(lineArr[6]),lineArr[7]);
                list.add(customer);
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
