package model.facility;

public class Facility {
    private int id;
    private String name;
    private int area;
    private double cost;
    private int maxPeople;
    private int rentTypeId;
    private int facilityTypeId;
    private String standardRoom;
    private String otherConvenience;
    private double poolArea;
    private int numberOfFloors;
    private String freeFacility;
    private FacilityType facilityType;
    private RentType rentType;

    public Facility() {
    }

    public Facility(int id, String name, int area, double cost,
                    int maxPeople, String standardRoom,
                    String otherConvenience, double poolArea, int numberOfFloors, String freeFacility, FacilityType facilityType, RentType rentType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.standardRoom = standardRoom;
        this.otherConvenience = otherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.freeFacility = freeFacility;
        this.facilityType = facilityType;
        this.rentType = rentType;
    }

    public Facility(String name, int area, double cost, int maxPeople, int rentTypeId, int facilityTypeId, String standardRoom, String otherConvenience, double poolArea, int numberOfFloors, String freeFacility) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentTypeId = rentTypeId;
        this.facilityTypeId = facilityTypeId;
        this.standardRoom = standardRoom;
        this.otherConvenience = otherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.freeFacility = freeFacility;
    }

    public Facility(String name, int area, double cost, int maxPeople, int rentTypeId, int facilityTypeId, String standardRoom, String otherConvenience, double poolArea, int numberOfFloors) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentTypeId = rentTypeId;
        this.facilityTypeId = facilityTypeId;
        this.standardRoom = standardRoom;
        this.otherConvenience = otherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Facility(String name, int area, double cost, int maxPeople, int rentTypeId, int facilityTypeId, String freeFacility) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentTypeId = rentTypeId;
        this.facilityTypeId = facilityTypeId;
        this.freeFacility = freeFacility;
    }

    public Facility(int id, String name, int area, double cost, int maxPeople, int rentTypeId, int facilityTypeId, String standardRoom, String otherConvenience, double poolArea, int numberOfFloors, String freeFacility) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.rentTypeId = rentTypeId;
        this.facilityTypeId = facilityTypeId;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.otherConvenience = otherConvenience;
        this.numberOfFloors = numberOfFloors;
        this.freeFacility = freeFacility;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(int rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public int getFacilityTypeId() {
        return facilityTypeId;
    }

    public void setFacilityTypeId(int facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherConvenience() {
        return otherConvenience;
    }

    public void setOtherConvenience(String otherConvenience) {
        this.otherConvenience = otherConvenience;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getFreeFacility() {
        return freeFacility;
    }

    public void setFreeFacility(String freeFacility) {
        this.freeFacility = freeFacility;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }
}
