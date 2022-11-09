package exercise.fan;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    int speed;
    boolean on = false;
    double radius;
    String color;

    public Fan() {
        this.speed = SLOW;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(int speed, String color, double radius) {
        this.speed = speed;
        this.color = color;
        this.radius = radius;
    }

    public String toString() {
        if (this.on) {
            return "speed: " + this.speed + " color: " + this.color + " radius: " + this.radius + ". The fan is on";
        } else
            return "speed: " + this.speed + " color: " + this.color + " radius: " + this.radius + ". The fan is off";
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn() {
        this.on = true;
    }


}
