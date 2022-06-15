package com.md.arif.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.md.arif.model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}

