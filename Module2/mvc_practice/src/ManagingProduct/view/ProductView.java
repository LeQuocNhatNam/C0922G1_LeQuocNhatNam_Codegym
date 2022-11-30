package ManagingProduct.view;

import ManagingProduct.controller.ProductController;
import ManagingProduct.model.Product;

import java.lang.reflect.Parameter;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    private static Scanner input = new Scanner(System.in);
    private ProductController productController = new ProductController();

    public void displayMenu() {
        do {
            System.out.println("----------Product-----------");
            System.out.println("1. Add a product");
            System.out.println("2. Display products");
            System.out.println("3. Search a product by ID");
            System.out.println("4. Exit");
            System.out.println("enter your choice:");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Please enter a new product's information");
                    System.out.println("enter id");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.println("enter name");
                    String name = input.nextLine();
                    System.out.println("enter brand");
                    String brand = input.nextLine();
                    System.out.println("enter price");
                    double price = Double.parseDouble(input.nextLine());
                    System.out.println("enter description:");
                    String description = input.nextLine();
                    this.productController.addProduct(new Product(id, name, brand, price, description));
                    break;
                case 2:
                    List<Product> list = this.productController.getProducts();
                    for (Product product : list) {
                        System.out.println(product.toString());
                    }
                    break;
                case 3:
                    System.out.println("please enter id:");
                    int idInput = Integer.parseInt(input.nextLine());
                    Product product = this.productController.searchProductByID(idInput);
                    System.out.println(product);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
            }
        } while (true);
    }
}

