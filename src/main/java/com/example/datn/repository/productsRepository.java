package com.example.datn.repository;

import com.example.datn.Model.products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productsRepository extends JpaRepository<products, Integer> {
}
