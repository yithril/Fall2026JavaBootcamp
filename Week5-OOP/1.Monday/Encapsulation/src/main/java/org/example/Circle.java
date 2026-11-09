package org.example;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    //derived getter
    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

    public double getDiameter(){
        return 2 * this.radius;
    }
}
