package com.example.dummyjson.ws;


import com.example.dummyjson.domain.ApiResponse;
import com.example.dummyjson.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(url = "${api.url}",name = "Products")
public interface DummyFeign {

  @GetMapping( produces = "application/json")
  ApiResponse getAllProducts();

  @GetMapping(produces = "application/json",value = "/{id}")
  Product getProductById(@PathVariable Long id);

}