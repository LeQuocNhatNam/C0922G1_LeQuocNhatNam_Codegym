package exercise.rezizable;

public class ArrayShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2, 3);
        shapes[2] = new Square(2);
        double random = Math.random() * 100;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                System.out.println(shapes[i]);
                System.out.println("Area=" + ((Circle) shapes[i]).getArea());
                ((Circle) shapes[i]).resize(random);
                System.out.println("after being resized");
                System.out.println("Area=" + ((Circle) shapes[i]).getArea());
                System.out.println();
            }
            if (shapes[i] instanceof Rectangle) {
                System.out.println(shapes[i]);
                System.out.println("Area=" + ((Rectangle) shapes[i]).getArea());
                ((Rectangle) shapes[i]).resize(random);
                System.out.println("after being resized");
                System.out.println("Area=" + ((Rectangle) shapes[i]).getArea());
                System.out.println();
            }
            if (shapes[i] instanceof Square) {
                System.out.println(shapes[i]);
                System.out.println("Area=" + ((Square) shapes[i]).getArea());
                ((Square) shapes[i]).resize(random);
                System.out.println("after being resized");
                System.out.println("Area=" + ((Square) shapes[i]).getArea());
                System.out.println();
            }
        }
    }
}
