package exercise.rezizable;

public class ResizableTest implements Resizable {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public ResizableTest(double side) {
        this.side = side;
    }


    @Override
    public void resize(double percent) {
       this.side *= percent/100;
    }

    public static void main(String[] args) {
        ResizableTest resizableTest = new ResizableTest(25);
        System.out.println("before:");
        System.out.println(resizableTest.getSide());
        resizableTest.resize(50);
        System.out.println("after:");
        System.out.println(resizableTest.getSide());
    }
}
