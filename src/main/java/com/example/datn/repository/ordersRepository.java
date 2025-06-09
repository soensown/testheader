package com.example.datn.repository;

import com.example.datn.Model.orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ordersRepository extends JpaRepository<orders, Integer> {
}
