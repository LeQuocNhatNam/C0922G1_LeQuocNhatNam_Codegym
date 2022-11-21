package exercise.practice_using_arraylist_linkedlist_in_JFW;

import java.util.Comparator;

public class ComparatorPriceFromSmallest implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getPrice() > product2.getPrice()) {
            return 1;
        } else if (product1.getPrice() < product2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}
