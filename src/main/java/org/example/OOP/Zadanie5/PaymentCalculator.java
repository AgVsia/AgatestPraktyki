package org.example.OOP.Zadanie5;

public class PaymentCalculator {
    private static final double ZUS_COST = 1000;
    private static final double INCOME_RATE_TAX = 0.2;

    public double nettoYearPayment(Employee employee) {
        return employee.getMonthlySalary() * 12;

    }

    public double bruttoYearPayment(Employee employee) {
        double monthlySalaryWithTax = employee.getMonthlySalary() + (INCOME_RATE_TAX* employee.getMonthlySalary());
        double zusCost = ZUS_COST * 12;
        return (monthlySalaryWithTax * 12) + ZUS_COST;
    }
}
