package com.example.Empresa.Controller;

import com.example.Empresa.model.Department;
import com.example.Empresa.model.HourContract;
import com.example.Empresa.model.Worker;
import com.example.Empresa.model.Enum.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level (JUNIOR / MID_LEVEL / SENIOR): ");
        String levelStr = sc.nextLine().toUpperCase();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(
                name,
                WorkerLevel.valueOf(levelStr),
                baseSalary,
                new Department(departmentName)
        );

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter contract #%d data:\n", i);
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();

            HourContract contract = new HourContract(date, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthYear = sc.next();
        int month = Integer.parseInt(monthYear.substring(0, 2));
        int year = Integer.parseInt(monthYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f%n", monthYear, worker.income(year, month));

        sc.close();
    }
}
