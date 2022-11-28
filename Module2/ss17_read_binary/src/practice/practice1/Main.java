package practice.practice1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
            }

        } finally {
            is.close();
            os.close();

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the source");
        String sourcePath = input.nextLine();
        System.out.println("Enter destination source");
        String desPath = input.nextLine();

        File sourceFile = new File(sourcePath);
        File desFile = new File(desPath);

        try {
            copyFileUsingJava7Files(sourceFile, desFile);
            System.out.println("completed!");
        } catch (IOException e) {
            System.out.println("Can't copy!");
            e.getStackTrace();
        }
        
    }
}
