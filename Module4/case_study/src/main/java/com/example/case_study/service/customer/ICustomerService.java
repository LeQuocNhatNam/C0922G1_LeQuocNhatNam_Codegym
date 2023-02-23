package com.example.case_study.service.customer;

import com.example.case_study.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> search(String name, String email, int customerTypeId, Pageable pageable);
    void save(Customer customer);
    Customer findById(int id);
    void remove(int id);

    List<Customer> findAllCustomer();
}
