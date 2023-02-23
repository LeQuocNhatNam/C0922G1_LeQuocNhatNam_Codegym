package com.example.case_study.service.contract;

import com.example.case_study.dto.IContractDTO;
import com.example.case_study.model.Contract;
import com.example.case_study.repository.contract.IContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository contractRepository;

    @Override
    public Page<IContractDTO> findAll(Pageable pageable) {
        return contractRepository.showListContract(pageable);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }
}
