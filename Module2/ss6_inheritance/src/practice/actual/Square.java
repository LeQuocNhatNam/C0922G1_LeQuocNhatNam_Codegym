package practice.actual;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setWidth(double side) {
        this.setSide(side);
    }

    @Override
    public void setHeight(double side) {
        this.setSide(side);
    }

    @Override
    public String toString() {
        return "A square with side=" + this.getSide()
                + ", which is a subclass of " + super.toString();
    }

}
