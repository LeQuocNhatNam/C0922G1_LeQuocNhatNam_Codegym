package com.example.case_study.service.contract;

import com.example.case_study.dto.IContractDetailDTO;
import com.example.case_study.model.ContractDetail;
import com.example.case_study.repository.contract.IContractDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    private IContractDetailRepository contractDetailRepository;


    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

    @Override
    public List<IContractDetailDTO> findContractDetailByContractId(int contractId) {
        return contractDetailRepository.findContractDetailByContractId(contractId);
    }
}
