package com.example.case_study.repository.contract;

import com.example.case_study.dto.IContractDTO;
import com.example.case_study.model.Contract;
import com.example.case_study.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IContractRepository extends JpaRepository<Contract, Integer> {
    @Query(value = "select * from select_all_contract_dto",nativeQuery = true)
    Page<IContractDTO> showListContract(Pageable pageable);
}
