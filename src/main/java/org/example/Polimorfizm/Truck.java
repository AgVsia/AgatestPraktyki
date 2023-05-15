package org.example.Polimorfizm;

//Klasa Truck dziedziczy po Vehicle
public class Truck extends Vehicle{
    //Nadpisuję metody z klasy bazowej
    @Override
    public void drive(){
        System.out.println("Truck is driving");
    }
    @Override
    public void stop(){
        System.out.println("Truck is stopping");
    }
}
