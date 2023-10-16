package com.example.springbootatlas.service;

import com.example.springbootatlas.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public List<Product> getProducts();

    public Product addProduct(Product product);

    public Product updateProduct(int id, Product product);

    public Product deleteProduct(int id);
}
