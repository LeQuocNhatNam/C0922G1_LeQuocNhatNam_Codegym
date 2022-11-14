package exercise.rezizable;

public class Square extends Shape implements Resizable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public void resize(double percent) {
        this.setSide(this.side * percent / 100);
    }

    @Override
    public String toString() {
        return "A square with " +
                "side=" + this.getSide();
    }
}
