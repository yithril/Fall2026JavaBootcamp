package org.example;

//method overloading
public class Calculator {
    public double add(double a, double b){
        return a + b;
    }

    public double add(double a, double b, double c){
        return a + b + c;
    }

    public double add(String a, String b){
        return 0;
    }
}
