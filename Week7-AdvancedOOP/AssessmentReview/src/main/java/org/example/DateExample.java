package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(); //year month day
        LocalTime localTime = LocalTime.now(); //hour minutes seconds and nanoseconds
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());

        System.out.println(localTime.getHour());
    }
}
