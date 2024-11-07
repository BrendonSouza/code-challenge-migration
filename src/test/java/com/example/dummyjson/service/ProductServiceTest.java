package com.example.dummyjson.service;

import com.example.dummyjson.dto.Product;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;


    @Test
    public void testGetAllProducts() {

        List<Product> result = productService.getAllProducts();
        assertEquals(30, result.size());
        assertEquals(1L, result.get(0).getId());
    }

    @Test
    public void testGetProductById() {
        Product product = new Product();
        product.setId(1L);
        Product result = productService.getProductById(1L);
        assertEquals(1L, result.getId());
    }
}
