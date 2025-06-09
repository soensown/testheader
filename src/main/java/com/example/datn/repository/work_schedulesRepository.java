package com.example.datn.repository;

import com.example.datn.Model.work_schedules;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface work_schedulesRepository extends CrudRepository<work_schedules, Integer> {
}
