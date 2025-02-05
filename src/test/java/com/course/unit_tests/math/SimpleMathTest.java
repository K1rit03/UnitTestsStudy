package com.course.unit_tests.math;

import static org.junit.jupiter.api.Assertions.* ;
import org.junit.jupiter.api.Test;

class  SimpleMathTest {
    @Test
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
    void testDiv(){
        Simplemath math = new Simplemath();
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double actual = math.division(6.2D, 2D);
        Double expected = 3.1D;
        assertEquals(expected, actual,
                () -> firstNumber + "/" + secondNumber + " should be " + expected);
    }
}
