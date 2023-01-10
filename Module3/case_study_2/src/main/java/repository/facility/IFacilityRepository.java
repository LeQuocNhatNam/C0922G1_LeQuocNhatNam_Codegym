package repository.facility;

import model.facility.Facility;

import java.util.List;

public interface IFacilityRepository {
    List<Facility> findAll();

    boolean saveFacility(Facility facility);

    Facility findFacilityById(int id);

    boolean updateFacility(Facility facility);

    boolean deleteFacility(int id);

    List<Facility> searchFacility(int facilityTypeIdSearch, String nameSearch);
}
