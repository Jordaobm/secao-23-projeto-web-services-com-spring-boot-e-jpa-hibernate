package com.webservices.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.course.entities.OrderItem;
import com.webservices.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
