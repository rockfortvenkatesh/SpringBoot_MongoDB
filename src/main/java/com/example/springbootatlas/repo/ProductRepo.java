package com.example.springbootatlas.repo;

import com.example.springbootatlas.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product,Integer> {

}
