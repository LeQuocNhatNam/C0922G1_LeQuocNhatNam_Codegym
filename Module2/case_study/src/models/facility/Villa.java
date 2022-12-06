package models.facility;

import java.util.Objects;

public class Villa extends Facility {
    private String roomStandard;
    private double poolSquare;
    private int numberOfStories;

    public Villa(String serviceID, String serviceName, double square, double rentalCost,
                 int maxNumberPeople, String rentalType, String roomStandard, double poolSquare, int numberOfStories) {
        super(serviceID, serviceName, square, rentalCost, maxNumberPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolSquare = poolSquare;
        this.numberOfStories = numberOfStories;
    }




    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolSquare() {
        return poolSquare;
    }

    public void setPoolSquare(double poolSquare) {
        this.poolSquare = poolSquare;
    }

    public int getNumberOfStories() {
        return numberOfStories;
    }

    public void setNumberOfStories(int numberOfStories) {
        this.numberOfStories = numberOfStories;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Villa villa2 = (Villa) o;
        return Double.compare(villa2.poolSquare, poolSquare) == 0 && numberOfStories == villa2.numberOfStories
                && Objects.equals(roomStandard, villa2.roomStandard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), roomStandard, poolSquare, numberOfStories);
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolSquare=" + poolSquare +
                ", floorNumber=" + numberOfStories + ", " +  super.toString();
    }
}
