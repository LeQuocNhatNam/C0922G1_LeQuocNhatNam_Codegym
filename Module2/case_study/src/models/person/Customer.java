package models.person;

public class Customer extends Person {
    private int customerID;
    private String customerType;
    public Customer(String name, String dateOfBirth, String gender, String identification, String phoneNumber, String email, int customerID, String customerType) {
        super(name, dateOfBirth, gender, identification, phoneNumber, email);
        this.customerID = customerID;
        this.customerType = customerType;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerType='" + customerType + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", identification='" + identification + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
