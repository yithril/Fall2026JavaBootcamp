package org.example;

public class MathExample {
    public static void main(String[] args) {
        //arithmetic operators in Java
        //+ - * /   PEMDAS
        //float, double, long, int

        double numerator = 5;
        int denominator = 10;
        int testNumber = 3;

        //System.out.println(numerator / denominator);

        //modulo %
        System.out.println(denominator % testNumber);

        //shortcuts for arithmetic
        double firstNumber = 10.5;
        double secondNumber = 22.7;

        firstNumber += 10; //firstNumber = firstNumber + 10
        secondNumber -= 10;

        //tick up numbers and tick down numbers by 1
        int x = 15;
        x++; //Adds 1 to x
        x--; //Subtracts 1 from x

        //Math Class Java's Built in calculator
        int baseNumber = 2;
        //2 to the 3rd power
        double result = Math.pow(2, 3);
        System.out.println(result);
    }
}
