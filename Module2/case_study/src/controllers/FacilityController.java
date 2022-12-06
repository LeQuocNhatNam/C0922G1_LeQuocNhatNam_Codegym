package controllers;

import models.facility.Facility;
import services.impl.FacilityServiceImpl;

import java.util.List;

public class FacilityController {
    private FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public List<Facility> getFacilityList() {
        return this.facilityService.getList();
    }

    public void addFacility(Facility facility, int usedTimes) {
        this.facilityService.addFacility(facility, usedTimes);
    }

    public List<Facility> getMaintenanceList() {
        return this.facilityService.getFacilityMaintenanceList();
    }
}
