package com.course.unit_tests.math;

import static org.junit.jupiter.api.Assertions.* ;
import org.junit.jupiter.api.Test;

class  SimpleMathTest {
    @Test
     voi d testSum(){
        Simplemath math = new Simplemath();
        Double actual = math.sum(6.2D, 2D);
        Double expected = 8.2D;
        assertEquals(expected, actual, "6.2 + 2 did not produce 8.2!");
    }
}
