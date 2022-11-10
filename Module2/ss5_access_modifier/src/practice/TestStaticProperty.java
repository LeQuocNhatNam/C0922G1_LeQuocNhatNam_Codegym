package practice;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda3", "Sky active 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda6", "Sky active 6");
        System.out.println(Car.numberOfCars);
    }
}
