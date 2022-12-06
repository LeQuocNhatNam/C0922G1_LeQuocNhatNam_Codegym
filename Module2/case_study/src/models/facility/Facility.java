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
        return Double.compare(facility.square, square) == 0 && Double.compare(facility.rentalCost, rentalCost) == 0 && maxNumberPeople == facility.maxNumberPeople && Objects.equals(serviceName, facility.serviceName) && Objects.equals(rentalType, facility.rentalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, square, rentalCost, maxNumberPeople, rentalType);
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
        return "serviceName='" + serviceName + '\'' +
                ", square=" + square +
                ", rentalCost=" + rentalCost +
                ", maxNumberPeople=" + maxNumberPeople +
                ", rentalType='" + rentalType + '\'';
    }
}
