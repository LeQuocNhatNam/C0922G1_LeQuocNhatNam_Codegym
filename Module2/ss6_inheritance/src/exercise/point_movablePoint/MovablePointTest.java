package exercise.point_movablePoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move().toString());
        System.out.println(movablePoint.move().toString());
    }
}
