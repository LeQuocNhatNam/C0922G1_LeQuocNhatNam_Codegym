package practice;

public class Circle extends Geometric {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * this.radius;
    }

    public double getDiameter() {
        return 2 * this.radius;
    }

    public void printCircle() {
        System.out.println("The " + this.getColor() + " circle is created with the radius is: " + this.radius);
    }

}
