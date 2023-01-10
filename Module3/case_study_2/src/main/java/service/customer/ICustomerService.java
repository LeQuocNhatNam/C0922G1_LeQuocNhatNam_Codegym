package service.customer;

import model.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    boolean saveCustomer(Customer customer);

    Customer getCustomerById(int id);

    boolean updateCustomer(Customer customer);

    boolean deleteCustomerById(int id);
}
