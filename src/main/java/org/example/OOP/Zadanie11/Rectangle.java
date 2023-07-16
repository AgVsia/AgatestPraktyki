package org.example.OOP.Zadanie11;

public class Rectangle extends Shape{
    private double height;
    private double width;
    public Rectangle(double height,double width){
        super("Rectangle");
        this.height=height;
        this.width=width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getWeight(){
        return width;
    }
    public void setWeight(double weight){
        this.width=width;
    }
    @Override
    public double getArea(){
        return width*height;
    }
    @Override
    public double getPerimeter(){
        return 2* (width+ height);
    }
}
