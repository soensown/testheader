package com.example.datn.repository;

import com.example.datn.Model.employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeesRepository extends JpaRepository<employees, Integer> {
}
