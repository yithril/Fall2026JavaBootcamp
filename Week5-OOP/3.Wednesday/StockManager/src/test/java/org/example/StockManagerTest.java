package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockManagerTest {

    //1. addStock — new product → returns true, getStock matches quantity
    @Test
    public void addStockReturnsTrue(){
        //Arrange
        StockManager stockManager = new StockManager();

        //Act
        boolean result = stockManager.addStock("Shampoo", 5);

        var quantity = stockManager.getStock("Shampoo");

        //Assert
        assertTrue(result);
        assertEquals(5, quantity);
    }
}