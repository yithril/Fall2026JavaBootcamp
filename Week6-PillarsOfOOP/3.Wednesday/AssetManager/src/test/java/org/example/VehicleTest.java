package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/vehicles.csv", numLinesToSkip = 1)
    public void getVehicleValue(
            String description,
            String dateAcquired,
            double originalCost,
            String makeModel,
            int year,
            int odometer,
            double expectedValue
    ) {

        // Arrange
        Vehicle vehicle = new Vehicle(
                description,
                dateAcquired,
                originalCost,
                makeModel,
                year,
                odometer
        );

        // Act
        double actualValue = vehicle.getValue();

        // Assert
        assertEquals(expectedValue, actualValue, 0.01);
    }

    //What if it is pipe delimited?
    /*
    @ParameterizedTest
    @CsvFileSource(resources = "/vehicles.csv", numLinesToSkip = 1, delimiter='|')
     */
}