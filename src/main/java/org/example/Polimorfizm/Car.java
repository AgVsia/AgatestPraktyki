package org.example.Polimorfizm;

//klasa Car dziedziczy po Vehicle
public class Car extends Vehicle{
    //Nadpisuję metody z klasy bazowej
    @Override
    public void drive(){
        System.out.println("Car is driving");
    }

    @Override
    public void stop(){
        System.out.println("Car is stopping");
    }
}
