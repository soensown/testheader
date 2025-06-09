package com.example.datn.repository;

import com.example.datn.Model.colors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface colorsRepository extends JpaRepository<colors, Integer> {
}
