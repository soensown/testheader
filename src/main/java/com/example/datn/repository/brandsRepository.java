package com.example.datn.repository;

import com.example.datn.Model.brands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface brandsRepository extends JpaRepository<brands, Integer> {
}
