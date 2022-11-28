package practice.theory_practice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws FileNotFoundException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("product.txt")));
            Product product = new Product(1, "Iphone12", 28000, "New");
            oos.writeObject(product);
            oos.flush();
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
            System.out.println("Success!");
        }
    }
}
