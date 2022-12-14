package practice;

import java.util.Date;

public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public SimpleGeometricObject() {
    }

    public SimpleGeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "SimpleGeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
