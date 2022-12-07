package services.impl;

import models.facility.Facility;
import models.facility.Room;
import models.facility.Villa;
import services.IFacilityService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {
    private final static Map<Facility, Integer> map = new LinkedHashMap<>();

    static {
        Facility room1 = new Room("1","Room1", 250, 1000, 10, "month", "sauna");
        Facility room2 = new Room("2","Room2", 400, 1500, 15, "days", "sauna, shuttle bus");
        Facility villa1 = new Villa("3","Villa1", 1000, 2000, 200, "days", "excellent", 250, 3);
        Facility villa2 = new Villa("4","Villa2", 2000, 5000, 300, "days", "excellent", 250, 4);
        map.put(room1, 3);
        map.put(room2, 4);
        map.put(villa1, 5);
        map.put(villa2, 6);
    }

    @Override
    public List<Facility> getFacilityMaintenanceList() {
        List<Facility> facilities = new ArrayList<>();
        for (Map.Entry<Facility, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 5){
                facilities.add(entry.getKey());
            }
        }
        return facilities;
    }

    @Override
    public List<Facility> getList() {
        ArrayList<Facility> facilities = new ArrayList<>(map.keySet());
        return facilities;
    }

    @Override
    public void addElement(Facility o) {

    }


    public void addFacility(Facility facility, int usedTimes) {
        for (Map.Entry<Facility, Integer> entry : map.entrySet()) {
            if (facility.equals(entry.getKey())) {
                System.out.println("already existed!");
                return;
            }
        }
        map.put(facility, usedTimes);
        System.out.println("successful!");
    }


}
