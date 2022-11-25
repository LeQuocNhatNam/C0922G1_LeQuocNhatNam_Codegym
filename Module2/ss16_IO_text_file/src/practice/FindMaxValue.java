package practice;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public int findMax(List<Integer> list){
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max<list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        FindMaxValue findMaxValue = new FindMaxValue();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers;
        try {
            numbers = readAndWriteFile.readFile("src/csv_file");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int max = findMaxValue.findMax(numbers);
        readAndWriteFile.writeFile("src/result.txt",max);
    }
}
