package utils.read_and_write_file_facility;

import models.facility.Facility;
import models.facility.Room;
import models.facility.Villa;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadFileFacility {

    public static Map<Facility, Integer> readFile(String pathName) {
        Map<Facility, Integer> map = new LinkedHashMap<>();
        File file = new File(pathName);
        if (!file.exists()) {
            System.out.println("file does not exist");
            return map;
        }

        BufferedReader bufferedReader = null;

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineArr = line.split(",");
                if (lineArr.length == 8) {
                    //String serviceID, String serviceName,
                    // double square, double rentalCost,
                    //                int maxNumberPeople, String rentalType, String freeServiceIncluded
                    Facility room = new Room(lineArr[0], lineArr[1], Double.parseDouble(lineArr[2]), Double.parseDouble(lineArr[3]),
                            Integer.parseInt(lineArr[4]), lineArr[5], lineArr[6]);
                    map.put(room, Integer.parseInt(lineArr[7]));
                } else {
                    Facility villa = new Villa(lineArr[0], lineArr[1], Double.parseDouble(lineArr[2]), Double.parseDouble(lineArr[3]),
                            Integer.parseInt(lineArr[4]), lineArr[5], lineArr[6], Double.parseDouble(lineArr[7]), Integer.parseInt(lineArr[8]));
                    map.put(villa, Integer.parseInt(lineArr[9]));
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
        return map;
    }
}
