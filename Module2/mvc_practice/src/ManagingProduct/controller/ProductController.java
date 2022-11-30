package ManagingProduct.controller;

import ManagingProduct.model.Product;
import ManagingProduct.service.IProductService;
import ManagingProduct.service.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private IProductService productService = new ProductServiceImpl();
    public ProductController() {
    }

    public void addProduct(Product product) {
        this.productService.addProduct(product);
    }

    public List<Product> getProducts(){
        return this.productService.getProducts();
    }
    public Product searchProductByID(int id){
        return this.productService.searchProductByID(id);
    }

}
