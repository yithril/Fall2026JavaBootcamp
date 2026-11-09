package org.example;

import java.math.BigDecimal;

public class StaticExamples {
    public static void main(String[] args) {
        BankAccount bankAccount =
                new BankAccount("8237423", new BigDecimal("1000000"));

        System.out.println(BankAccount.SWIFT_CODE);
    }
}
