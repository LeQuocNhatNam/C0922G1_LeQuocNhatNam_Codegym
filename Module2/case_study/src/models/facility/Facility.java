package models.facility;

import sun.dc.pr.PRError;

import java.util.Objects;

public abstract class Facility {
    private String serviceID;
    private String serviceName;
    private double square;
    private double rentalCost;
    private int maxNumberPeople;
    private String rentalType;


    public Facility(String serviceID, String serviceName, double square, double rentalCost, int maxNumberPeople, String rentalType) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.square = square;
        this.rentalCost = rentalCost;
        this.maxNumberPeople = maxNumberPeople;
        this.rentalType = rentalType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return serviceID.equals(facility.serviceID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceID);
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceID() {
        return serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxNumberPeople() {
        return maxNumberPeople;
    }

    public void setMaxNumberPeople(int maxNumberPeople) {
        this.maxNumberPeople = maxNumberPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }


    @Override
    public String toString() {
        return "Facility{" +
                "serviceID='" + serviceID + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", square=" + square +
                ", rentalCost=" + rentalCost +
                ", maxNumberPeople=" + maxNumberPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public String toStringCSV() {
        //String serviceID, String serviceName, double square, double rentalCost, int maxNumberPeople, String rentalType
        return this.getServiceID() + "," + this.getServiceName() + "," + this.getSquare() + "," + this.getRentalCost() +
                "," + this.getMaxNumberPeople() + "," + this.getRentalType();
    }
}
