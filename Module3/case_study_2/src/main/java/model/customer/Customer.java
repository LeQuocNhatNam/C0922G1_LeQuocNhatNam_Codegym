package model.customer;

import java.sql.Date;

public class Customer {
    private int numberOfContracts;
    private int id;
    private CustomerType customerType;
    private int CustomerTypeId;
    private String name;
    private Date dateOfBrith;
    private boolean gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(int id, CustomerType customerType, String name, Date dateOfBrith, boolean gender, String idCard, String phoneNumber, String email, String address) {
        this.id = id;
        this.customerType = customerType;
        this.name = name;
        this.dateOfBrith = dateOfBrith;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public Customer(int customerTypeId, String name, Date dateOfBrith,
                    boolean gender, String idCard, String phoneNumber, String email, String address) {
        CustomerTypeId = customerTypeId;
        this.name = name;
        this.dateOfBrith = dateOfBrith;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public Customer(int id, int customerTypeId, String name, Date dateOfBirth, boolean gender, String idCard, String phoneNumber, String email, String address) {
        this.id = id;
        CustomerTypeId = customerTypeId;
        this.name = name;
        this.dateOfBrith = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public Customer(String name, Date dateOfBirth, String address, String phoneNumber, int numberOfContracts) {
        this.name = name;
        this.dateOfBrith = dateOfBirth;
        this.address = address;
        this.numberOfContracts = numberOfContracts;
        this.phoneNumber = phoneNumber;
    }

    public int getNumberOfContracts() {
        return numberOfContracts;
    }

    public void setNumberOfContracts(int numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    public int getCustomerTypeId() {
        return CustomerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        CustomerTypeId = customerTypeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(Date dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
