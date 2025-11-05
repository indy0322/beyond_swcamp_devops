package com.ohgiraffers.bootproject.repository;

import com.ohgiraffers.bootproject.entity.CalculationHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CalculationHistoryRepository extends JpaRepository<CalculationHistory, Long> {

    List<CalculationHistory> findAllByOrderByCreatedAtDesc();
}
