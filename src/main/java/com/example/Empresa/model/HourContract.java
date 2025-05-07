package com.example.Empresa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HourContract {
    private LocalDate date;
    private double valuePerHour;
    private int hours;

    public double totalValue() {
        return valuePerHour * hours;
    }
}
