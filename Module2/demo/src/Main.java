public class Main {
    public static void main(String[] args)  {
//        try {
//            System.out.println("inside try");
//            throw new AgeException();
//        } catch (AgeException e){
//            System.out.println("inside catch");
//        }
        throw new RuntimeException();
        System.out.println("after");
    }
}