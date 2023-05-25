package org.example.OOP.Zadanie3;

public class CabrioTest {
    public static void main(String[] args) {

        Cabrio car = new Cabrio("Samochód Cabrio", " Marka X");

        car.openRoof();
        car.startMoving();

        car.openRoof();
        car.closeRoof();

        car.stopMoving();
        car.closeRoof();
    }
}
