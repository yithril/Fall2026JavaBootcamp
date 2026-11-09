package org.example;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(10);

        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
