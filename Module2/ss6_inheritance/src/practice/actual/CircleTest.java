package practice.actual;


public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.0);
        System.out.println(circle);
        circle = new Circle("green", false, 3.0);
        System.out.println(circle);
    }
}
