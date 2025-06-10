package com.example.datn.repository;

import com.example.datn.Model.colors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface colorsRepository extends JpaRepository<colors, Integer> {
    @Query("SELECT c FROM colors c where colors.colorName AND c.colorCode like%?1% " )
    List<colors> findByColorName(String colorName);
}
