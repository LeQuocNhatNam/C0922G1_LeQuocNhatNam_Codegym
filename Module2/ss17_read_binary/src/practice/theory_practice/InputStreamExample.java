package practice.theory_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("src/practice/theory_practice/codegym.txt");
            int i = -1;
            while ((i = is.read()) != -1) {
                System.out.print((char) i);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
