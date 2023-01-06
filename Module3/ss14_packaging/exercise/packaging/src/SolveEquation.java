
public class SolveEquation {

    public static void solveEquation2(int a, int b, int c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0){
            System.out.println("no root");
        } else if (delta >0) {
            double root1 = (-b + Math.sqrt(delta)/(2*a));
            double root2 = (-b - Math.sqrt(delta)/(2*a));
            System.out.println("root 1: " + root1);
            System.out.println("root 2: " + root2);
        }else {
            System.out.println("one root: " + -b/2/a);
        }
    }

}
