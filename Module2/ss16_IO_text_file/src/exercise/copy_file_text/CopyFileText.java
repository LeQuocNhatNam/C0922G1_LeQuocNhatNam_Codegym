package exercise.copy_file_text;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) throws FileNotFoundException {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> list = readAndWriteFile.readFile("src/exercise/copy_file_text/source_file.txt");
        readAndWriteFile.writeFile("src/exercise/copy_file_text/target_file.txt", list);
    }
}
