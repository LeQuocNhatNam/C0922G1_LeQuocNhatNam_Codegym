package exercise.practice_using_arraylist_linkedlist_in_JFW;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.print("please make a choice: \n" +
                    "1. add product\n" +
                    "2. Edit product name by id\n" +
                    "3. Delete product by id\n" +
                    "4. Display the list of products\n" +
                    "5. Find product by name and get information\n" +
                    "6. Arrange products in an ascending order by price\n" +
                    "7. Arrange products in a descending order by price\n" +
                    "0. Exit\n");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("please enter the name:");
                    String name = input.nextLine();
                    System.out.print("please enter the id:");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.print("please enter the price:");
                    int price = Integer.parseInt(input.nextLine());
                    Product product = new Product(name,id,price);
                    productManager.addProduct(product);
                    break;
                case 2:
                    System.out.print("Please enter the id:");
                    int idChanged = Integer.parseInt(input.nextLine());
                    System.out.print("Please enter the new name:");
                    String nameChanged = input.nextLine();
                    productManager.changeNameByID(idChanged,nameChanged);
                    break;
                case 3:
                    System.out.print("Please enter the id:");
                    int idRemoved = Integer.parseInt(input.nextLine());
                    productManager.removeProductByID(idRemoved);
                    break;
                case 4:
                    System.out.println(productManager.getProductList());
                    break;
                case 5:
                    System.out.println("please enter the name you want to get information");
                    String nameFound = input.nextLine();
                    System.out.println(productManager.findProductByName(nameFound));
                    break;
                case 6:
                    Collections.sort(productManager.getProductList(),new ComparatorPriceFromSmallest());
                    System.out.println("Done sorting!");
                    break;
                case 7:
                    Collections.sort(productManager.getProductList(), new ComparatorPriceFromGreaterToSmaller());
                    System.out.println("Done sorting!");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);


//        Product product1 = new Product("iPhone7", 2, 20);
//        Product product2 = new Product("iPhone6", 1, 15);
//        Product product3 = new Product("iPhone8", 3, 35);
//        Product product4 = new Product("iPhone11", 4, 50);
//        productManager.addProduct(product1);
//        productManager.addProduct(product2);
//        productManager.addProduct(product3);
//        productManager.addProduct(product4);

//        System.out.println(productManager.getProductList());
//        productManager.changePriceByID(3,40);
//        System.out.println("after changing price for id=3: ");
//        System.out.println(productManager.getProductList());

//        productManager.changeNameByID(1,"iPhone10");
//        System.out.println("after changing name for id=1: ");
//        System.out.println(productManager.getProductList());

////        productManager.removeProductByID(2);
////        System.out.println("after removing product for id = 2");
////        System.out.println(productManager.getProductList());

//        System.out.println("finding product information by name iPhone 8");
//        System.out.println(productManager.findProductByName("iPhone8"));

//        Collections.sort(productManager.getProductList(), new ComparatorPriceFromGreaterToSmaller());
//        System.out.println("sorted from greatest price");
//        System.out.println(productManager.getProductList());
//        Collections.sort(productManager.getProductList(), new ComparatorPriceFromSmallest());
//        System.out.println("sorted from smallest price");
//        System.out.println(productManager.getProductList());

    }
}
