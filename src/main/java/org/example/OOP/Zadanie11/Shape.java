package org.example.OOP.Zadanie11;

    public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public abstract double getArea();

    public double getPerimeter() {
        return 0;
    }
}

