package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @ParameterizedTest
    @CsvSource({
            "'My mansion', '12-01-2002', 10000, '123 Street', 1, 500, 1000, 90250",
            "'Tiny house', '01-01-2020', 5000, '456 Road', 1, 300, 500, 45250",
            "'Luxury villa', '05-10-2015', 20000, '789 Ave', 2, 800, 2000, 160500",
            "'Starter home', '03-15-2018', 7000, '321 Lane', 1, 400, 800, 70250"
    })
    public void getHouseValue(String description,
                              String purchaseDate,
                              double purchasePrice,
                              String address,
                              int quality,
                              int squareFeet,
                              int lotSize,
                              double expectedValue){
        //Arrange
        //Excellent Condition, 500 sq. ft 1000 lot size
        House house = new House(description, purchaseDate, purchasePrice, address,
                quality, squareFeet, lotSize);

        //Act
        //run get value and see what happens
        double testValue = house.getValue();

        //Assert
        //I assert the result will be 90250
        assertEquals(expectedValue, testValue);
    }
}