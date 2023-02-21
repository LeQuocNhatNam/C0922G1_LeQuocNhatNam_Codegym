package com.example.case_study.service.facility;

import com.example.case_study.model.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IFacilityService {

    Page<Facility> searchFacility(String name, int id, Pageable pageable);

    void save(Facility facility);

    Facility findById(int id);

    void remove(int id);

}
