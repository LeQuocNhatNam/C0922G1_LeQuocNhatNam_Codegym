package com.example.case_study.service.contract;

import com.example.case_study.dto.IContractDetailDTO;
import com.example.case_study.model.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    void save(ContractDetail contractDetail);

    List<IContractDetailDTO> findContractDetailByContractId(int contractId);
}
