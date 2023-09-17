package com.graphql.controller;

import com.graphql.entity.Product;
import com.graphql.service.ProductService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService service;
    public ProductController(ProductService service)
    {
        this.service = service;
    }

    @MutationMapping(name = "createProduct")
    public Product createProduct(@Argument ProductInput product)
    {
       Product product1 = new Product();
       product1.setName(product.getName());
        product1.setPrice(product.getPrice());
        return this.service.createProduct(product1);
    }

    @QueryMapping(name = "getAllProducts")
    public List<Product> getALlProducts(){
        return this.service.getAllProducts();
    }
}
