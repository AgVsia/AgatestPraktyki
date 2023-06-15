package org.example.OOP.Zadanie4;

public class Ingredient {
    private String name;
    private double amount;

    Ingredient(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

