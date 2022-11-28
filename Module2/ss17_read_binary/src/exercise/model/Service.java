package exercise.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    private static List<Product> list = new ArrayList<>();

    public static void addProduct(int id, String name, String brand, int price, String description) throws Exception {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/exercise/repository/repo.txt"));
        list.add(new Product(id, name, brand, price, description));
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
        System.out.println("successful!");
    }

    public static void displayProduct() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/exercise/repository/repo.txt"));
        List<Product> list = (List<Product>) objectInputStream.readObject();
        if (list.size() != 0) {
            for (Product product : list) {
                System.out.println(product);
            }
        } else {
            System.out.println("empty list!");
        }
    }

    public static void searchProduct(int id) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/exercise/repository/repo.txt"));
        List<Product> list = (List<Product>) objectInputStream.readObject();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println(list.get(i));
                return;
            }
            System.out.println("not found!");
        }

    }
}
