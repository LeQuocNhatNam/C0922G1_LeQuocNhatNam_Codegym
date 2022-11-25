package practice;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) throws FileNotFoundException {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";

        try {
            while ((line = bufferedReader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            try {
                fileReader.close();
                bufferedReader.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("max= " + max);

        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
