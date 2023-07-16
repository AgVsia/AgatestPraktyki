package org.example.OOP.Zadanie10;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, String surname, int salary, int bonus) {
        super(name, surname, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int calculatePayment() {
        return super.calculatePayment() + bonus;
    }
}
