package practice.actual;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(2);
        System.out.println(square);
        square = new Square("black",false,3);
        System.out.println(square);
    }
}
