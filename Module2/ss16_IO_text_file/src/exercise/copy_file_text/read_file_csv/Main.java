package exercise.copy_file_text.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = readFile("src/exercise/copy_file_text/read_file_csv/country_csv.txt");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    public static List<String> readFile(String pathName) {
        List<String> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";

        try {
            fileReader = new FileReader(pathName);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
            return list;
        }
    }
}
