package com.example.case_study.dto;

import com.example.case_study.model.AttachFacility;
import com.example.case_study.model.Contract;

import javax.persistence.*;

public class ContractDetailDTO {

    private ContractDTO contractDTO;

    private AttachFacility attachFacility;

    private int quantity;

    public ContractDetailDTO() {
    }

    public ContractDetailDTO(ContractDTO contractDTO, AttachFacility attachFacility, int quantity) {
        this.contractDTO = contractDTO;
        this.attachFacility = attachFacility;
        this.quantity = quantity;
    }

    public ContractDTO getContractDTO() {
        return contractDTO;
    }

    public void setContractDTO(ContractDTO contractDTO) {
        this.contractDTO = contractDTO;
    }

    public AttachFacility getAttachFacility() {
        return attachFacility;
    }

    public void setAttachFacility(AttachFacility attachFacility) {
        this.attachFacility = attachFacility;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
