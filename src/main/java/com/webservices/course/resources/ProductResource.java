package com.webservices.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.course.entities.Product;
import com.webservices.course.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

  @Autowired
  private ProductService productService;

  @GetMapping
  public ResponseEntity<List<Product>> findAll() {
    List<Product> list = productService.findAll();
    return ResponseEntity.ok().body(list);
  };

  @GetMapping(value = "/{id}")
  public ResponseEntity<Product> findAll(@PathVariable Long id) {
    Product product = productService.findById(id);
    return ResponseEntity.ok().body(product);
  };
}
