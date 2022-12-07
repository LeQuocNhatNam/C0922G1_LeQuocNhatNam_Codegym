package services.impl;

import models.person.Customer;
import models.person.Employee;
import services.ICustomerService;

import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private final static LinkedList<Customer> customerLinkedList = new LinkedList<>();


    @Override
    public void editCustomer(int customerEditedID, int choice, String newElementValue) {
        switch (choice) {
            case 1:
                for (Customer customer : customerLinkedList) {
                    if (customer.getCustomerID() == customerEditedID) {
                        customer.setName(newElementValue);
                        break;
                    }
                }
                break;
            case 2:
                for (Customer customer : customerLinkedList) {
                    if (customer.getCustomerID() == customerEditedID) {
                        customer.setDateOfBirth(newElementValue);
                        break;
                    }
                }
                break;
            case 3:
                for (Customer customer : customerLinkedList) {
                    if (customer.getCustomerID() == customerEditedID) {
                        customer.setGender(newElementValue);
                        break;
                    }
                }
                break;
            case 4:
                for (Customer customer : customerLinkedList) {
                    if (customer.getCustomerID() == customerEditedID) {
                        customer.setIdentification(newElementValue);
                        break;
                    }
                }
                break;
            case 5:
                for (Customer customer : customerLinkedList) {
                    if (customer.getCustomerID() == customerEditedID) {
                        customer.setPhoneNumber(newElementValue);
                        break;
                    }
                }
                break;
            case 6:
                for (Customer customer : customerLinkedList) {
                    if (customer.getCustomerID() == customerEditedID) {
                        customer.setEmail(newElementValue);
                        break;
                    }
                }
                break;
            case 7:
                for (Customer customer : customerLinkedList) {
                    if (customer.getCustomerID() == customerEditedID) {
                        customer.setCustomerType(newElementValue);
                        break;
                    }
                }
                break;
            default:
                break;
        }
    }

    public boolean customerExisted(int customerID) {
        for (Customer customer : customerLinkedList) {
            if (customer.getCustomerID() == customerID) {
                return true;
            }
        }
        return false;

    }


    @Override
    public List<Customer> getList() {
        return customerLinkedList;
    }

    @Override
    public void addElement(Customer customer) {
        for (Customer cus: customerLinkedList ){
            if (cus.getCustomerID() == customer.getCustomerID()){
                System.out.println("already existed");
                return;
            }
        }
        customerLinkedList.add(customer);
        System.out.println("successful!");
    }


}
