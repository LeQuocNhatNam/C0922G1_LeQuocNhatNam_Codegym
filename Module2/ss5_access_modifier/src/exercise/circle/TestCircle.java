package exercise.circle;

import exercise.circle.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
    }
}
