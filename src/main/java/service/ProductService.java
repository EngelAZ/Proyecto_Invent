package service;

import java.util.ArrayList;

import infrastructure.ProductRepositoryImpl;
import model.Product;

public class ProductService {

    private ProductRepositoryImpl repository;

    public ProductService()
    {
        this.repository = new ProductRepositoryImpl();
    }

    public boolean createProduct(Product product) {
        return repository.insertProduct(product);
    }

}