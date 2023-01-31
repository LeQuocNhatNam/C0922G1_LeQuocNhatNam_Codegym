package repository.contract;

import model.contract.AttachFacility;
import model.contract.CustomerUsingService;

import java.util.List;

public interface IContractRepository {
    List<CustomerUsingService> findAll();

    List<CustomerUsingService> findCustomerUsingService();

    List<AttachFacility> findAllAttachFacility();


    boolean addAttachFacility(int attachFacilityId, int quantity, int contractId);
}
