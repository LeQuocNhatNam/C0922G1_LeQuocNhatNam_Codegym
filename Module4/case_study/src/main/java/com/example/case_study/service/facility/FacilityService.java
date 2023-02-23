package com.example.case_study.service.facility;

import com.example.case_study.model.Facility;
import com.example.case_study.repository.facility.IFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityService implements IFacilityService {

    @Autowired
    private IFacilityRepository facilityRepository;

    @Override
    public Page<Facility> searchFacility(String name, int facilityTypeId, Pageable pageable) {
        if (facilityTypeId == 0) {
            return facilityRepository.findByName("%" + name + "%", pageable);
        } else {
            return facilityRepository.findByNameAndFacilityTypeId("%" + name + "%", facilityTypeId, pageable);
        }
    }

    @Override
    public void save(Facility facility) {
        this.facilityRepository.save(facility);
    }

    @Override
    public Facility findById(int id) {
        return facilityRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(int id) {
        Facility facility = facilityRepository.findById(id).orElse(null);
        if (facility.equals(null)) {
            try {
                throw new Exception("null");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        facility.setFlag(false);
    }

    @Override
    public List<Facility> findAll() {
        return facilityRepository.findAll();
    }

}
