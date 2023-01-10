package service.facility.impl;

import model.facility.Facility;
import repository.facility.IFacilityRepository;
import repository.facility.impl.FacilityRepository;
import service.facility.IFacilityService;

import java.util.List;

public class FacilityService implements IFacilityService {
    private IFacilityRepository facilityRepository = new FacilityRepository();
    @Override
    public List<Facility> findAll() {
        return this.facilityRepository.findAll();
    }

    @Override
    public boolean saveFacility(Facility facility) {
        return this.facilityRepository.saveFacility(facility);
    }

    @Override
    public Facility findFacilityById(int id) {
        return this.facilityRepository.findFacilityById(id);
    }

    @Override
    public boolean updateFacility(Facility facility) {
        return this.facilityRepository.updateFacility(facility);
    }

    @Override
    public boolean deleteFacility(int id) {
        return this.facilityRepository.deleteFacility(id);
    }

    @Override
    public List<Facility> searchFacility(int facilityTypeIdSearch, String nameSearch) {
        return this.facilityRepository.searchFacility(facilityTypeIdSearch,nameSearch);
    }
}
