package exercise.rezizable;

public class CircleRectangleSquareTest {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(2,3);
        Square square = new Square(2);
        System.out.println("before:");
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        circle.resize(50);
        rectangle.resize(50);
        square.resize(50);
        System.out.println("after: ");
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());

    }
}
