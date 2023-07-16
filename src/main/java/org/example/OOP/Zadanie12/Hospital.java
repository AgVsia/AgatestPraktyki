package org.example.OOP.Zadanie12;

public class Hospital {
    private Person[] employees;
    private int employeeCount;

    public Hospital() {
        employees = new Person[10];
        employeeCount = 0;
    }

    public void add(Person person) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = person;
            employeeCount++;
        }
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        for (int i = 0; i < employeeCount; i++) {
            Person person = employees[i];
            info.append("Name").append(person.getName()).append(" Surname: ").append(person.getSurname()).append(" Salary: ").append(person.getSalary()).append("\n");
        }
        return info.toString();
    }
}
