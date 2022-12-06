package services;

import models.person.Customer;

public interface ICustomerService extends IService<Customer>{

    void editCustomer(int customerID,int choice, String newElementValue);


}
