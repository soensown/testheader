package com.example.datn.repository;

import com.example.datn.Model.warehouse_inventory;
import com.example.datn.Model.warehouses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface warehousesRepository extends CrudRepository<warehouses, Integer> {
}
