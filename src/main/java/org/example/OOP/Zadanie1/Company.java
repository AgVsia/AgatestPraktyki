package org.example.OOP.Zadanie1;

import java.sql.SQLOutput;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setName("Aga");
        employee1.setLastName("Bejba");
        employee1.setBirthDate("14.10.1988");
        employee1.setSeniority("Dwa lata");
        employee1.setSalary(6500);
        employee1.setPosition("Tester");

        System.out.println("Imię pracownika:" + employee1.getName());
        System.out.println("Nazwisko pracownika:" + employee1.getLastName());
        System.out.println("Data urodzenia:" + employee1.getBirthDate());
        System.out.println("Staż pracy: " + employee1.getSeniority());
        System.out.println("Pensja: " + employee1.getSalary());
        System.out.println("Posada: " + employee1.getPosition());

        Employee employee2 = new Employee();
        employee2.setName("Adam");
        employee2.setLastName("Nowak");
        employee2.setBirthDate("02.02.2005");
        employee1.setSeniority("Dwa lata");
        employee2.setSalary(4500);
        employee2.setPosition("Sprzedawca");

        System.out.println("Imię pracownika:" + employee2.getName());
        System.out.println("Nazwisko pracownika:" + employee2.getLastName());
        System.out.println("Data urodzenia:" + employee2.getBirthDate());
        System.out.println("Staż pracy: " + employee2.getSeniority());
        System.out.println("Pensja: " + employee2.getSalary());
        System.out.println("Posada: " + employee2.getPosition());

        Employee employee3 = new Employee();

        employee3.setName("Monika");
        employee3.setLastName("Kawka");
        employee3.setBirthDate("05.12.1978");
        employee3.setSeniority("Pięć lata");
        employee3.setSalary(3500);
        employee3.setPosition("Opiekunka");

        System.out.println("Imię pracownika:" + employee3.getName());
        System.out.println("Nazwisko pracownika:" + employee3.getLastName());
        System.out.println("Data urodzenia:" + employee3.getBirthDate());
        System.out.println("Staż pracy: " + employee3.getSeniority());
        System.out.println("Pensja: " + employee3.getSalary());
        System.out.println("Posada: " + employee3.getPosition());
    }
}
