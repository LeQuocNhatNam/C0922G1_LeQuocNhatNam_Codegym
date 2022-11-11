package exercise.codegym.circle_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3, "black", 5);
        System.out.println(cylinder);
        System.out.println("volume is " + cylinder.getVolume());
        System.out.println("area of the circle is " + cylinder.getArea());
        System.out.println("Perimeter is "+ cylinder.getPerimeter());
    }
}
