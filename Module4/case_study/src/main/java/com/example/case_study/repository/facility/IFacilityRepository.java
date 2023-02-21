package com.example.case_study.repository.facility;

import com.example.case_study.model.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IFacilityRepository extends JpaRepository<Facility, Integer> {

    @Query(value = "select * from facility where name like :name and facility_type_id like :facilityTypeId and flag = true", nativeQuery = true)
    Page<Facility> findByNameAndFacilityTypeId(@Param("name") String name,@Param("facilityTypeId") int facilityTypeId, Pageable pageable);

    @Query(value = "select * from facility where name like :name and flag = true",nativeQuery = true)
    Page<Facility> findByName(@Param("name") String name, Pageable pageable);


}
