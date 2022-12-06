package models.facility;

import java.util.Objects;

public class Room extends Facility {
    private String freeServiceIncluded;


    public Room(String serviceID, String serviceName, double square, double rentalCost,
                int maxNumberPeople, String rentalType, String freeServiceIncluded) {
        super(serviceID, serviceName, square, rentalCost, maxNumberPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                ", " + super.toString();
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Room room = (Room) o;
        return Objects.equals(freeServiceIncluded, room.freeServiceIncluded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freeServiceIncluded);
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }
}
