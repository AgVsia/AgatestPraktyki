package org.example.OOP.Zadanie11;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Pole koła: " + circle.getArea() + " Obwód koła: " + circle.getPerimeter());
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Pole prostokąta: " + rectangle.getArea() + " Obwód prostokata: " + rectangle.getPerimeter());
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Pole trójkąta: " + triangle.getArea() + " Obwód trójkata: " + triangle.getPerimeter());
    }
}
