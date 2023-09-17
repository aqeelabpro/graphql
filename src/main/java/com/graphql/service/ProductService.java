package com.graphql.service;

import com.graphql.entity.Product;
import com.graphql.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository){
        this.repository = repository;
    }

    public Product createProduct(Product product)
    {
        return this.repository.save(product);
    }


    public List<Product> getAllProducts()
    {
        return this.repository.findAll();
    }

}
