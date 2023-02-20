package com.example.case_study.service.customer;

import com.example.case_study.model.Customer;
import com.example.case_study.repository.customer.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;


    @Override
    public Page<Customer> search(String name, String email, int customerTypeId, Pageable pageable) {
        if (customerTypeId == 0) {
            return customerRepository.findByNameAndEmail("%" + name + "%", "%" + email + "%", pageable);
        } else {
            return customerRepository.findAllCustomerByNameAndEmailAndCustomerTypeId("%" + name + "%", "%" + email + "%", customerTypeId ,pageable);
        }
    }

    @Override
    public void save(Customer customer) {

        customerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        if (!customerRepository.findById(id).isPresent()){
            return null;
        }
        return customerRepository.findById(id).get();
    }

    @Override
    public void remove(int id) {
        Customer customer = customerRepository.findById(id).get();
        customer.setFlag(false);
        customerRepository.save(customer);
    }


}
