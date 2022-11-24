package exercise.illegal_triangle_exception;

public class Test {
    public static void main(String[] args) throws IllegalTriangleException {
        Triangle triangle = new Triangle(1, 2, -2);
        System.out.println(triangle);
    }
}
