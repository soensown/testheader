package com.example.datn.repository;

import com.example.datn.Model.categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoriesRepository extends JpaRepository<categories, Integer> {
}
