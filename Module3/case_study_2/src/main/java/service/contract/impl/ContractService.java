package service.contract.impl;

import model.contract.AttachFacility;
import model.contract.Contract;
import model.contract.CustomerUsingService;
import repository.contract.IContractRepository;
import repository.contract.impl.ConTractRepository;
import service.contract.IContractService;

import java.util.List;

public class ContractService implements IContractService {
    private IContractRepository contractRepository = new ConTractRepository();

    @Override
    public List<Contract> findAll() {
        return null;
    }

    @Override
    public List<CustomerUsingService> findCustomerUsingService() {
        return this.contractRepository.findCustomerUsingService();
    }

    @Override
    public List<AttachFacility> findAllAttachFacility() {
        return this.contractRepository.findAllAttachFacility();
    }

    @Override
    public boolean addAttachFacility(int attachFacilityId, int quantity, int contractId) {
        return this.contractRepository.addAttachFacility(attachFacilityId,quantity,contractId);
    }


}
