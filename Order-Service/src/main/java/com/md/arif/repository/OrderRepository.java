package com.md.arif.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.md.arif.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
