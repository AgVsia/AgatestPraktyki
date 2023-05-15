package org.example.Polimorfizm;

//Klasa Motorcycle dziedziczy po Vehicle
public class Motorcycle extends Vehicle{
    //Nadpisuję metody z klasy bazowej
    @Override
    public void drive(){
        System.out.println("Motorcycle is driving");
    }

    @Override
    public void stop(){
        System.out.println("Motorcycle is stopping");
    }
}
