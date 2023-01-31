package service.contract;

import model.contract.AttachFacility;
import model.contract.Contract;
import model.contract.CustomerUsingService;

import java.util.List;

public interface IContractService {
    List<Contract> findAll();
    List<CustomerUsingService> findCustomerUsingService();

    List<AttachFacility> findAllAttachFacility();


    boolean addAttachFacility(int attachFacilityId, int quantity, int contractId);
}
