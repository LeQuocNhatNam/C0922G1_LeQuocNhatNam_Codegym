package com.example.case_study.service.contract;

import com.example.case_study.dto.IContractDTO;
import com.example.case_study.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<IContractDTO> findAll(Pageable pageable);

    void save(Contract contract);
}
