package org.example.OOP.Zadanie12;

public class Nurse extends Person {
    private double overtime;

    public Nurse(String name, String surname, double salary, double overtime) {
        super(name, surname, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;

    }
}
