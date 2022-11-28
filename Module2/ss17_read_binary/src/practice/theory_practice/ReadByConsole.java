package practice.theory_practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadByConsole {
    public static void main(String[] args) {
        InputStream is = System.in;


        while (true) {
            try {
                System.out.println("Please enter a character:");
                int ch = is.read();
                if (ch == 'q') {
                    System.out.println("Finished!");
                    break;
                }
                is.skip(2);
                System.out.println("Characters got are: " +  ch);
            } catch (IOException e) {
                e.getStackTrace();
            }

        }
    }
}
