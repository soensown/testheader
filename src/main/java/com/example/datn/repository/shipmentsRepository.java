package com.example.datn.repository;

import com.example.datn.Model.shipments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface shipmentsRepository extends CrudRepository<shipments, Integer> {
}
