package com.course.unit_tests.math;

import static org.junit.jupiter.api.Assertions.* ;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math Operations in Simplemath Class ")
class SimpleMathTest {

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum(){
        Simplemath math = new Simplemath();
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double actual = math.sum(6.2D, 2D);
        Double expected = 8.2D;
        assertEquals(expected, actual,
                () -> firstNumber + "+" + secondNumber + " should be " + expected);
    }

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    void testSub(){
        Simplemath math = new Simplemath();
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double actual = math.subtraction(6.2D, 2D);
        Double expected = 4.2D;
        assertEquals(expected, actual,
                () -> firstNumber + "-" + secondNumber + " should be " + expected);
    }

    @Test
    @DisplayName("Test 6.2 * 2 = 12.4")
    void testMulti(){
        Simplemath math = new Simplemath();
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double actual = math.multiplication(6.2D, 2D);
        Double expected = 12.4D;
        assertEquals(expected, actual,
                () -> firstNumber + "*" + secondNumber + " should be " + expected);
    }

    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    void testDiv(){
        Simplemath math = new Simplemath();
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double actual = math.division(6.2D, 2D);
        Double expected = 3.1D;
        assertEquals(expected, actual,
                () -> firstNumber + "/" + secondNumber + " should be " + expected);
    }

    @Test
    @DisplayName("Test Division By Zero")
    void testDivByZero(){
        Simplemath math = new Simplemath();
        Double firstNumber = 6.2D;
        Double secondNumber = 0D;
        assertThrows(ArithmeticException.class, () -> math.division(6.2D, 0D),
                () -> firstNumber + "/" + secondNumber + " should throw an ArithmeticException");
    }

    @Test
    @DisplayName("Test Square Root of 4 = 2")
    void testSquareRoot(){
        Simplemath math = new Simplemath();
        Double number = 4D;
        Double actual = math.squareRoot(4D);
        Double expected = 2D;
        assertEquals(expected, actual,
                () -> "The square root of " + number + " should be " + expected);
    }

    @Test
    @DisplayName("Test Mean of 6.2 and 2 = 4.1")
    void testMean(){
        Simplemath math = new Simplemath();
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double actual = math.mean(6.2D, 2D);
        Double expected = 4.1D;
        assertEquals(expected, actual,
                () -> "The mean of " + firstNumber + " and " + secondNumber + " should be " + expected);
    }
}