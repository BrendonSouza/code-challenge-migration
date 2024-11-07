package com.example.dummyjson.domain;

import com.example.dummyjson.dto.Product;

import java.util.List;

public class ApiResponse {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }
}
