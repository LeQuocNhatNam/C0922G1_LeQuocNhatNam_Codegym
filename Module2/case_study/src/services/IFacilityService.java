package services;

import models.facility.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityService extends IService<Facility> {
    Map<Facility,Integer> getFacilityMaintenanceList();
}
