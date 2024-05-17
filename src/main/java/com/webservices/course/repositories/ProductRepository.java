package com.webservices.course.repositories;

import com.webservices.course.entities.Category;
import com.webservices.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
