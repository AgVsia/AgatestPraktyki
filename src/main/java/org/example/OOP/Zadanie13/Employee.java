package org.example.OOP.Zadanie13;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;

    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void work(){
        System.out.println("Ogólne info o pracy pracownika: ");
    }
}
