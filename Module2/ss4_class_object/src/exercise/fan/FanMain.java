package exercise.fan;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,"red",10);
        Fan fan2 = new Fan(2,"blue",5);
        fan1.setOn();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
