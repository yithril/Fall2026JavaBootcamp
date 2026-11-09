package org.example;

import java.math.BigDecimal;

public class BigDecimalExercise {
    public static void main(String[] args) {
        BigDecimal subtotal = new BigDecimal("85.5");
        BigDecimal fifty = new BigDecimal("50");

        if(subtotal.compareTo(fifty) > 0){
            BigDecimal discount = BigDecimal.valueOf(.1);
            BigDecimal discountAmount = subtotal.multiply(discount);
            subtotal = subtotal.subtract(discountAmount);
        }


    }
}
