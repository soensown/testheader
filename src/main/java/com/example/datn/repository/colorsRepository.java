package com.example.datn.repository;

import com.example.datn.Model.colors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface colorsRepository extends JpaRepository<colors, Integer> {
    @Query("SELECT c FROM colors c WHERE c.colorName LIKE %?1% OR c.colorCode LIKE %?1%")
    List<colors> searchByNameOrCode(String keyword);
}
