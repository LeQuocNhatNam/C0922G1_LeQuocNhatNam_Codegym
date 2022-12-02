package views;

import controllers.FuramaController;

public class CustomerView {
    private static FuramaController furamaController = new FuramaController();
    public static void main(String[] args) {
        furamaController.displayMainMenu();
    }
}
