package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal price = new BigDecimal("0.1");
        BigDecimal price2 = BigDecimal.valueOf(.2);

        //you cannot use + - * /
        //add subtract multiply divide
        BigDecimal total = price.add(price2);

        //dividing looks ugly
        var result = new BigDecimal("10")
                .divide(new BigDecimal("3"), 2, RoundingMode.HALF_UP);

        //System.out.println(total);
        BigDecimal firstNumber = BigDecimal.valueOf(10);
        BigDecimal secondNumber = BigDecimal.valueOf(20);
        BigDecimal thirdNumber = BigDecimal.valueOf(10);

        //You cannot use > < >= <= ==
        //compareTo possibly returns 3 values= 1, 0, -1
        //1 means greater than
        //-1 means less than
        //0 means equal to
        System.out.println(secondNumber.compareTo(firstNumber));

        //rounding and scale?
        BigDecimal tax = new BigDecimal("4.617");
        //if we want to round it use setScale
        tax = tax.setScale(2, RoundingMode.HALF_UP);
        System.out.println(tax);
    }
}