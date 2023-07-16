package org.example.OOP.Zadanie12;

public class Doctor extends Person {
    private double bonus;

    public Doctor(String name, String surname, double salary, double bonus) {
        super(name, surname, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;

    }
}
