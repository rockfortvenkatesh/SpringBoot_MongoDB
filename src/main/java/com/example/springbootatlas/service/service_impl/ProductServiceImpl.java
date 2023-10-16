package com.example.springbootatlas.service.service_impl;

import com.example.springbootatlas.entity.Product;
import com.example.springbootatlas.repo.ProductRepo;
import com.example.springbootatlas.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;
    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }


    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product OriginalProduct = productRepo.findById(id).get();
        OriginalProduct.setProduct_name((product.getProduct_name()));
        OriginalProduct.setPrice(product.getPrice());
        OriginalProduct.setQuantity(product.getQuantity());
        productRepo.save(OriginalProduct);
        return OriginalProduct;
    }

    @Override
    public Product deleteProduct(int id) {
        Product product = productRepo.findById(id).get();
         productRepo.delete(product);
         return product;
    }
}
