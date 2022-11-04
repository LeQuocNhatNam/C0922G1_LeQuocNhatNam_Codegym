import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your weight: ");
        int weight = Integer.parseInt(input.nextLine());
        if (weight < 0) {
            System.out.println("out of ability");
        }
        if (weight < 10 && weight >= 0) {
            switch (weight) {
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                default:
                    System.out.println("nine");
            }
        } else if (weight <= 20) {
            switch (weight) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
                case 20:
                    System.out.println("Twenty");
            }
        } else if (weight < 100) {
            int tens = weight / 10;
            int ones = weight % 10;
            switch (tens) {
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }
            switch (ones) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.println("nine");
                default:
                    System.out.println("");
            }
        } else if (weight < 1000) {
            int hundreds = weight / 100;
            int tensOnes = weight % 100;
            switch (hundreds) {
                case 1:
                    System.out.print("one hundred ");
                    break;
                case 2:
                    System.out.print("two hundred ");
                    break;
                case 3:
                    System.out.print("three hundred ");
                    break;
                case 4:
                    System.out.print("four hundred ");
                    break;
                case 5:
                    System.out.print("five hundred ");
                    break;
                case 6:
                    System.out.print("six hundred ");
                    break;
                case 7:
                    System.out.print("seven hundred ");
                    break;
                case 8:
                    System.out.print("eight hundred ");
                    break;
                default:
                    System.out.print("nine hundred ");
            }
            if (tensOnes < 10 && tensOnes >= 0) {
                switch (tensOnes) {
                    case 0:
                        System.out.print("Zero");
                        break;
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    default:
                        System.out.println("nine");
                }
            } else if (tensOnes <= 20) {
                switch (tensOnes) {
                    case 10:
                        System.out.print("ten");
                        break;
                    case 11:
                        System.out.print("eleven");
                        break;
                    case 12:
                        System.out.println("twelve");
                        break;
                    case 13:
                        System.out.println("thirteen");
                        break;
                    case 14:
                        System.out.println("fourteen");
                        break;
                    case 15:
                        System.out.println("fifteen");
                        break;
                    case 16:
                        System.out.println("sixteen");
                        break;
                    case 17:
                        System.out.println("seventeen");
                        break;
                    case 18:
                        System.out.println("eighteen");
                        break;
                    case 19:
                        System.out.println("nineteen");
                        break;
                    case 20:
                        System.out.println("Twenty");
                }
            } else {
                int tens = tensOnes / 10;
                int ones = tensOnes % 10;
                switch (tens) {
                    case 2:
                        System.out.print("twenty ");
                        break;
                    case 3:
                        System.out.print("thirty ");
                        break;
                    case 4:
                        System.out.print("forty ");
                        break;
                    case 5:
                        System.out.print("fifty ");
                        break;
                    case 6:
                        System.out.print("sixty ");
                        break;
                    case 7:
                        System.out.print("seventy ");
                        break;
                    case 8:
                        System.out.print("eighty ");
                        break;
                    case 9:
                        System.out.print("ninety ");
                        break;
                }
                switch (ones) {
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                    default:
                        System.out.println("");
                }
            }
        } else {
            System.out.println("out of ability");
        }

    }

}
