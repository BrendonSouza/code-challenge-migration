package com.example.dummyjson.controller;

import com.example.dummyjson.dto.Product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class ProductControllerTest {

    @Autowired
    private ProductController productController;

    @Test
    public void testGetAllProducts() {
       ResponseEntity<List<Product>> result = productController.getAllProducts();
        assertEquals(30, result.getBody().size());
    }

    @Test
    public void testGetProductById() {
        ResponseEntity<Product> result = productController.getProductById(1L);
        assertEquals(1L, result.getBody().getId());
    }
}
