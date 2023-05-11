package org.example.OOP.Theory;

//nazwa klasy zawsze Wielką litera! tworzymy ją za pomocą słowa kluczowego class i nazwy, dalej {} wyznaczają ciało tej klasy
//nasza klasa Human będzie przechowywała info o człowieku
public class Human {
    //pola klasy
    private int age;
    private String firstName;
    private String lastName;
    private double height;

    //konstruktory

    //metody (gettery i settery)
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
}
