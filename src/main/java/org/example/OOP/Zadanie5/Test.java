package org.example.OOP.Zadanie5;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Andrzej", "Grzebyk", 3000);
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        double nettoPayment = paymentCalculator.nettoYearPayment(employee);
        double bruttoPayment = paymentCalculator.bruttoYearPayment(employee);

        System.out.println("Roczna wypłata netto: " + employee.getFirstName() + " " + employee.getLastName() + ": " + nettoPayment + " zł");
        System.out.println("Roczna wypłata brutto: " + employee.getFirstName() + employee.getLastName() + bruttoPayment + "zł");
        System.out.println("Roczny koszt pracodawcy: " + employee.getFirstName() + employee.getLastName() + (bruttoPayment - nettoPayment) + "zł");
    }
}
