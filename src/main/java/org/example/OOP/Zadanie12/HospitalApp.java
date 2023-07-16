package org.example.OOP.Zadanie12;

public class HospitalApp {
    public static void main(String[]args){
        Hospital hospital= new Hospital();
        hospital.add(new Doctor("Jan", " Profeska", 7500, 1300));
        hospital.add(new Nurse(" Anna", " Dobraszewska", 2200, 6));
        hospital.add(new Nurse(" Marta", " Daniulska", 2100, 3));
        System.out.println("Pracownicy szpitala: " + hospital.getInfo());
    }
}
