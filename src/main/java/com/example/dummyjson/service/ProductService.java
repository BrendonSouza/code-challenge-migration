package com.example.dummyjson.service;

import com.example.dummyjson.dto.Product;
import com.example.dummyjson.ws.DummyFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class ProductService {

    private final DummyFeign dummyFeign;

    public ProductService(DummyFeign dummyFeign) {
        this.dummyFeign = dummyFeign;
    }

    public List<Product> getAllProducts() {
        List<Product> products = dummyFeign.getAllProducts().getProducts();
        return products;
    }

    public Product getProductById(Long id) {
        Product product = dummyFeign.getProductById(id);
        return product;
    }
}
