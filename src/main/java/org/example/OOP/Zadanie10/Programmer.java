package org.example.OOP.Zadanie10;

public class Programmer extends Employee {
    private String programmingLanguage;

    public Programmer(String name, String surname, int salary, String programmingLanguage) {
        super(name, surname, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;

    }
}

