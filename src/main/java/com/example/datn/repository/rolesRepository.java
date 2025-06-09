package com.example.datn.repository;

import com.example.datn.Model.roles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rolesRepository extends CrudRepository<roles, Integer> {
}
