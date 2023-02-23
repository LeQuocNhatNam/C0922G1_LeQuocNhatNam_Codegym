package com.example.case_study.repository.contract;

import com.example.case_study.dto.IContractDetailDTO;
import com.example.case_study.model.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IContractDetailRepository extends JpaRepository<ContractDetail,Integer> {
    @Query(value = "select * from select_contract_detail_by_contract_id where contract_id = :contract_id ",nativeQuery = true)
    List<IContractDetailDTO> findContractDetailByContractId(@Param("contract_id") int contractId);
}
