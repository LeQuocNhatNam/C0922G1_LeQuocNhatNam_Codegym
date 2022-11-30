package ManagingProduct.service;

import ManagingProduct.model.Product;

import java.util.List;

public interface IProductService {

    void addProduct(Product product);

    List<Product> getProducts();

    Product searchProductByID(int id);
}
