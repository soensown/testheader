package com.example.datn.repository;

import com.example.datn.Model.product_materials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface product_materialsRepository extends JpaRepository<product_materials, Integer> {
}
