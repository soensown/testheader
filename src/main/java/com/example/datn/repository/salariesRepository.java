package com.example.datn.repository;

import com.example.datn.Model.salaries;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface salariesRepository extends CrudRepository<salaries, Integer> {
}
