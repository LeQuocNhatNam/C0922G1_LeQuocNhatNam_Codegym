package practice.actual;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2, 3);
        System.out.println(rectangle);
        rectangle = new Rectangle("lightblue", true, 5, 7);
        System.out.println(rectangle);
    }
}
