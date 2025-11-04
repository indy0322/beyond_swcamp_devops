package com.ohgiraffers.bootproject.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CalculatorDTO {
    @NonNull
    private Integer num1;
    @NonNull
    private Integer num2;

    private int sum = 0;

    public CalculatorDTO(int i, int i1) {
        this.num1 = i;
        this.num2 = i1;
        sum = i1 + i1;
    }
}
