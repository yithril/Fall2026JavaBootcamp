package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
  //tests are methods
  //test methods return VOID and are public
  //how do we differentiate between a regular method and a test method?
  //For right now, nothing goes in the parenthesis (thats more advanced)
  //Annotation when you see the @ symbol that is an Annotation

  @Test
  public void addTwoNumbers(){
     //Arrange (Sometimes arrange and act can be collapsed together)

     //Act
     double testResult = Calculator.add(1, 2);

    //Assert
    assertEquals(3, testResult);
  }

  //Test Drive Development TDD
    // This is a strategy of building software
    //In TDD you write the test FIRST and then write the code
    @Test
    public void subtractNumbers(){
      double result = Calculator.subtract(10, 5);

      assertEquals(5, result);
    }
}