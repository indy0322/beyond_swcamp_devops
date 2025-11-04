package com.ohgiraffers.bootproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name = "calculation_history")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class CalculationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer num;

    @Column(nullable = false)
    private Integer num2;

    @Column(nullable = false)
    private Integer result;

    @Column(name="created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public CalculationHistory(Integer num, Integer num2, Integer result) {
        this.num = num;
        this.num2 = num2;
        this.result = result;
    }
}
