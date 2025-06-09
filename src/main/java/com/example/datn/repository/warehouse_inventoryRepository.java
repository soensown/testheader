package com.example.datn.repository;

import com.example.datn.Model.warehouse_inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface warehouse_inventoryRepository extends CrudRepository<warehouse_inventory, Integer> {
}
