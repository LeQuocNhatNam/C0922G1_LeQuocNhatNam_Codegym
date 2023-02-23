package com.example.case_study.service.facility;

import com.example.case_study.model.AttachFacility;
import com.example.case_study.repository.facility.IAttachFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IAttachFacilityService {

    List<AttachFacility> findAll();

}
