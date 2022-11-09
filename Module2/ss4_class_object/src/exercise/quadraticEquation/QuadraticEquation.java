package exercise.quadraticEquation;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {

    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt((this.b * this.b - 4 * this.a * this.c))) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt((this.b * this.b - 4 * this.a * this.c))) / (2 * this.a);
    }



}
