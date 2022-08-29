package com.bruncts.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruncts.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}