package com.example.Empresa.model;

import com.example.Empresa.model.Enum.WorkerLevel;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {}

    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        for (HourContract c : contracts) {
            int cYear = c.getDate().getYear();
            int cMonth = c.getDate().getMonthValue();
            if (cYear == year && cMonth == month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
