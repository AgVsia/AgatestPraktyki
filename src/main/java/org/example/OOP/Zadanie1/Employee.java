package org.example.OOP.Zadanie1;

public class Employee {
    private String name;
    private String lastName;
    private String birthDate;
    private String seniority;
    private double salary;
    private String position;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
