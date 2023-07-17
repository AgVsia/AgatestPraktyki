package org.example.OOP.Zadanie11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Shape circle = new Circle(5);
//        Shape rectangle = new Rectangle(4, 6);
//        Shape triangle = new Triangle(3, 4, 5);
//
//        System.out.println("Pole koła: " + circle.getArea() + " Obwód koła: " + circle.getPerimeter());
//        System.out.println("Pole prostokąta: " + rectangle.getArea() + " Obwód prostokata: " + rectangle.getPerimeter());
//        System.out.println("Pole trójkąta: " + triangle.getArea() + " Obwód trójkata: " + triangle.getPerimeter());

        //korzystamy z polimorfizmu
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(3, 4, 5);

        for (Shape shape : shapes){
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }

        //Nie korzystamy z polimorfizmu
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());


        //Na listach + polimorfizm
        //Shape[] shapes = new Shape[3];
        ArrayList<Shape> shapesArr = new ArrayList<>();
        shapesArr.add(new Circle(5));
        shapesArr.add(new Rectangle(4, 6));
        shapesArr.add(new Triangle(3, 4, 5));

        for (Shape shape : shapesArr){
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }

    }
}
