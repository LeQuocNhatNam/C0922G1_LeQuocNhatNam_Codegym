package controllers;

import models.facility.Facility;
import services.impl.FacilityServiceImpl;

import java.util.List;
import java.util.Map;

public class FacilityController {
    private FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public Map<Facility,Integer> getFacilityList() {
        return this.facilityService.getMap();
    }

    public void addFacility(Facility facility, int usedTimes) {
        this.facilityService.addFacility(facility, usedTimes);
    }

    public Map<Facility,Integer> getMaintenanceList() {
        return this.facilityService.getFacilityMaintenanceList();
    }
}
