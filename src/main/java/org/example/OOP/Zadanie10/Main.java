package org.example.OOP.Zadanie10;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(" Jan", " Kowalski", 5000);
        System.out.println("Imię pracownika: " + employee.getName() + " Nazwisko pracownika: " + employee.getSurname() + " Wypłata: " + employee.calculatePayment());
        Manager manager = new Manager(" Anna", " Nowak", 7000, 2000);
        System.out.println("Imię managera : " + manager.getName() + " Nazwisko managera: " + manager.getSurname() + " Wypłata: " + manager.calculatePayment());
        Programmer programmer = new Programmer(" Piotr", " Zieliński", 6000, " Java");
        System.out.println("Imię programisty: " + programmer.getName() + " Nazwisko programisty: " + programmer.getSurname() + " Wypłata: " + programmer.calculatePayment());
    }
}