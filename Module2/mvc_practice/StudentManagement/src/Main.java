public class Main {


    static int a1() throws NumberFormatException {
        int a = Integer.parseInt("asdf");
        System.out.println(a);
        return a;
    }

    static void b() throws NumberFormatException {
        a1();
    }

    public static void main(String[] args) {
//        String str = null;
//        try {
//            System.out.println(str.length());
//        } catch (NullPointerException e) {
//            System.out.println("Error");
//            str = "in catch";
//        }
//        System.out.println("asdf");
//        System.out.println(str);
        try {
            b();

        } catch (NumberFormatException e) {
            System.out.println("what?");
            try {
                System.out.println(a1());

            } catch (NumberFormatException e1) {
                System.out.println("inside");
            }
        }
    }
}