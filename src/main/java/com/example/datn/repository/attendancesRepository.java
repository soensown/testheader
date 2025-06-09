package com.example.datn.repository;

import com.example.datn.Model.attendances;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface attendancesRepository extends JpaRepository<attendances, Integer> {

}
