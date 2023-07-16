package org.example.OOP.Zadanie9;

public class ElectronicProduct extends Product {
    private int guaranteeOfMonths;

    public ElectronicProduct(String name, double price, double weight, int guaranteeOfMonths) {
        super(name, price, weight);
        this.guaranteeOfMonths = guaranteeOfMonths;
    }

    public int getGuaranteeOfMonths() {
        return guaranteeOfMonths;
    }

    public void setGuaranteeOfMonths(int guaranteeOfMonths) {
        this.guaranteeOfMonths = guaranteeOfMonths;
    }
}

