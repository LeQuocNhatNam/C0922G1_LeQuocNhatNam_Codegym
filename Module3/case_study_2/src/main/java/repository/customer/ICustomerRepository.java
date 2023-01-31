package repository.customer;

import model.customer.Customer;

import java.sql.Date;
import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    boolean saveCustomer(Customer customer);

    Customer getCustomerById(int id);

    boolean updateCustomer(Customer customer);

    boolean deleteCustomerById(int id);

    List<Customer> findAllCustomerContract();
}
