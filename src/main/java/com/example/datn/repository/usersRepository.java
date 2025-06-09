package com.example.datn.repository;

import com.example.datn.Model.users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends CrudRepository<users, Integer> {
}
