package com.example.datn.repository;

import com.example.datn.Model.common_codes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface common_codesRepository extends JpaRepository<common_codes, Integer> {
}
