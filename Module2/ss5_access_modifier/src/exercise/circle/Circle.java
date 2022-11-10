package exercise.circle;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    double getRadius() {
        return radius;
    }

}
