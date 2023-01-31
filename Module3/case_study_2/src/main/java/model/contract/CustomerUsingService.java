package model.contract;

import java.sql.Timestamp;

public class CustomerUsingService {


    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    private int contractId;
    private String serviceName;
    private String customerName;
    private Timestamp startDate;
    private Timestamp endDate;
    private double deposit;
    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public CustomerUsingService(int contractId, String serviceName, String customerName, Timestamp startDate, Timestamp endDate, double deposit, double total) {
        this.contractId = contractId;
        this.serviceName = serviceName;
        this.customerName = customerName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.total = total;
    }

}
