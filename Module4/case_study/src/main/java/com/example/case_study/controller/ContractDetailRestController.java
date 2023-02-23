package com.example.case_study.controller;

import com.example.case_study.dto.ContractDetailDTO;
import com.example.case_study.dto.IContractDetailDTO;
import com.example.case_study.model.Contract;
import com.example.case_study.model.ContractDetail;
import com.example.case_study.service.contract.IContractDetailService;
import com.example.case_study.service.contract.IContractService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContractDetailRestController {
    @Autowired
    private IContractDetailService contractDetailService;
    @Autowired
    private IContractService contractService;
    @GetMapping("/contract-detail")
    public ResponseEntity<List<IContractDetailDTO>> findAll(@RequestParam int contractId){
        List<IContractDetailDTO> contractDetailDTOList = contractDetailService.findContractDetailByContractId(contractId);
        if (contractDetailDTOList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contractDetailDTOList,HttpStatus.OK);
    }

    @PostMapping("/contract/save")
    public ResponseEntity save(@RequestBody List<ContractDetailDTO> contractDetailDTOList){
        Contract contract = new Contract();
        BeanUtils.copyProperties(contractDetailDTOList.get(0).getContractDTO(),contract);
        contractService.save(contract);
        for (ContractDetailDTO contractDetailDTO : contractDetailDTOList){
            ContractDetail contractDetail = new ContractDetail();
            BeanUtils.copyProperties(contractDetailDTO,contractDetail);
            contractDetail.setContract(contract);
            contractDetailService.save(contractDetail);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
