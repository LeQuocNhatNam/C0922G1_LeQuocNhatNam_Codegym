package exercise.practice_using_arraylist_linkedlist_in_JFW;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {
    private List<Product> productList = new LinkedList<>();
    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }

    public ProductManager() {
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void changePriceByID(int id, int price) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.get(i).setPrice(price);
            }
        }
    }

    public void changeNameByID(int id, String newName) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.get(i).setName(newName);
            }
        }
    }

    public void removeProductByID(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(productList.get(i));
                System.out.println("REMOVED!");
                return;
            }
        }
        System.out.println("Invalid id");
    }

    public Product findProductByName(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "productList=" + getProductList().toString();
    }

}
