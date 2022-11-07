public class Main {
    public static void main(String[] args) {
        boolean isPrime;
        for (int i = 2; i < 100; i++) {
            isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % 2 == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }
}