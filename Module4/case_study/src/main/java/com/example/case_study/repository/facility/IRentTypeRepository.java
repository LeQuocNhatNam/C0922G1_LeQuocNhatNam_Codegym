package com.example.case_study.repository.facility;

import com.example.case_study.model.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentTypeRepository extends JpaRepository<RentType,Integer> {
}
