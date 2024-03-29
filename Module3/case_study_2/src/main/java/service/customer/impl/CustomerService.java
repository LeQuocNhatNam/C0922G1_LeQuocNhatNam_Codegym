package service.customer.impl;

import model.customer.Customer;
import repository.customer.ICustomerRepository;
import repository.customer.impl.CustomerRepository;
import service.customer.ICustomerService;

import java.time.LocalDate;
import java.util.ArrayList;
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

    @Override
    public Customer getCustomerById(int id) {
        return this.customerRepository.getCustomerById(id);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return this.customerRepository.updateCustomer(customer);
    }

    @Override
    public boolean deleteCustomerById(int id) {
        return this.customerRepository.deleteCustomerById(id);
    }

    @Override
    public List<Customer> findAllCustomerContract() {
        return this.customerRepository.findAllCustomerContract();
    }

    @Override
    public List<LocalDate> getDateValidate() {
        List<LocalDate> dateList = new ArrayList<>();
        LocalDate earliestDateOfBirth = LocalDate.now().minusYears(90);
        LocalDate latestDateOfBirth = LocalDate.now().minusYears(18);
        dateList.add(earliestDateOfBirth);
        dateList.add(latestDateOfBirth);
        return dateList;
    }
}
