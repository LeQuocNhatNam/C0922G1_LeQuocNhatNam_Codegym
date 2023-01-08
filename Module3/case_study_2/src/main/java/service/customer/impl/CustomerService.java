package service.customer.impl;

import model.customer.Customer;
import repository.customer.ICustomerRepository;
import repository.customer.impl.CustomerRepository;
import service.customer.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {

private ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public boolean saveCustomer(Customer customer) {
        return this.customerRepository.saveCustomer(customer);
    }
}
