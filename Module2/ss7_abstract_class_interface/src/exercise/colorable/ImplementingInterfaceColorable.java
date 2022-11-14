package exercise.colorable;

public class ImplementingInterfaceColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2, 3);
        shapes[2] = new Square(2);
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Square) {
                System.out.print("This is " + shapes[i].toString() + ". So, please ");
                ((Square) shapes[i]).howToColor();
            } else if (shapes[i] instanceof Rectangle) {
                System.out.println("Area of rectangle = " + ((Rectangle) shapes[i]).getArea());
            } else {
                System.out.println("Area of circle = " + ((Circle) shapes[i]).getArea());
            }
        }
    }
}
