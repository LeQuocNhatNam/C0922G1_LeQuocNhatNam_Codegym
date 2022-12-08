package services.impl;

import models.facility.Facility;
import services.IFacilityService;
import utils.read_and_write_file_facility.ReadFileFacility;
import utils.read_and_write_file_facility.WriteFileFacility;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {
    private static Map<Facility, Integer> map = new LinkedHashMap<>();
    private static final String FACILITY_PATH_NAME = "src/datas/facility.csv";

    @Override
    public Map<Facility, Integer> getFacilityMaintenanceList() {
        map = ReadFileFacility.readFile(FACILITY_PATH_NAME);
        for (Map.Entry<Facility, Integer> entry : map.entrySet()) {
            if (entry.getValue() <5 ) {
                map.remove(entry.getKey());
            }
        }
        return map;
    }

    @Override
    public List<Facility> getList() {
        return null;
    }

    public Map<Facility, Integer> getMap() {
        map = ReadFileFacility.readFile(FACILITY_PATH_NAME);
        return map;
    }

    @Override
    public void addElement(Facility o) {

    }


    public void addFacility(Facility facility, int usedTimes) {
        map = ReadFileFacility.readFile(FACILITY_PATH_NAME);
        for (Map.Entry<Facility, Integer> entry : map.entrySet()) {
            if (facility.equals(entry.getKey())) {
                System.out.println("already existed!");
                return;
            }
        }
        map.put(facility, usedTimes);
        WriteFileFacility.writeFileFacility(FACILITY_PATH_NAME, map);
        System.out.println("successful!");
    }
}
