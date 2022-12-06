
package controllers;

import models.person.Customer;
import services.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    private CustomerServiceImpl customerService = new CustomerServiceImpl();

    public List<Customer> getCustomerList() {
        return this.customerService.getList();
    }

    public void addCustomer(Customer customer) {
        this.customerService.addElement(customer);
    }

    public boolean customerExisted(int customerEditedID) {
        return this.customerService.customerExisted(customerEditedID);
    }

    public void editCustomer(int customerEditedID, int editedChoice, String newElementValue) {
        this.customerService.editCustomer(customerEditedID,editedChoice,newElementValue);
    }
}
