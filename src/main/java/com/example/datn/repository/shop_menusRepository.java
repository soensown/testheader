package com.example.datn.repository;

import com.example.datn.Model.shop_menus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface shop_menusRepository extends CrudRepository<shop_menus, Integer> {
}
