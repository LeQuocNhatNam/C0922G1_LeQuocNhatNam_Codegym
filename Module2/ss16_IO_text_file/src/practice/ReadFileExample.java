package practice;

import java.io.*;

public class ReadFileExample {
    public void readFileText() throws FileNotFoundException {
        File file = new File("src/csv_file");
        FileReader fileReader = new FileReader(file);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        int sum = 0;

        try {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
                System.out.println("Total= " + sum);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ReadFileExample readFileExample = new ReadFileExample();
        try {
            readFileExample.readFileText();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
