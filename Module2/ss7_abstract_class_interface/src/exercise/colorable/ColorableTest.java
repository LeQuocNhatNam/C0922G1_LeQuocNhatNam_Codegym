package exercise.colorable;

public class ColorableTest implements Colorable {
    public ColorableTest() {
    }

    @Override
    public void howToColor() {
        System.out.println("color!");
    }

    public static void main(String[] args) {
        ColorableTest colorableTest = new ColorableTest();
        colorableTest.howToColor();
    }
}

