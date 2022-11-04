import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = Float.parseFloat(input.nextLine());
        System.out.print("Enter height: ");
        height = Float.parseFloat(input.nextLine());

        float area = width * height;
        System.out.println("Area is: " + area);
    }

}
