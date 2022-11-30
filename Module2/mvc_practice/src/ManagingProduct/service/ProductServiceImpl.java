package ManagingProduct.service;

import ManagingProduct.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService {

    @Override
    public void addProduct(Product product) {
        List<Product> products = new ArrayList<>();
        ObjectOutputStream objectOutputStream = null;
//        FileInputStream fileInputStream = null;
//        ObjectInputStream objectInputStream = null;

        try {
//            fileInputStream = new FileInputStream("src/ManagingProduct/repository/product.txt");
//            objectInputStream = new ObjectInputStream(fileInputStream);
//            products = (List<Product>) objectInputStream.readObject();
            products.add(product);
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/ManagingProduct/repository/product.txt"));
            objectOutputStream.writeObject(products);
            System.out.println("Successful!");
        } catch (IOException e) {
            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
//                objectInputStream.close();
//                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        ObjectInputStream objectInputStream = null;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/ManagingProduct/repository/product.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return products;
    }

    @Override
    public Product searchProductByID(int id) {
        List<Product> list = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream("src/ManagingProduct/repository/product.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();
            for (Product product : list) {
                if (product.getId() == id) {
                    return product;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                objectInputStream.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
