package com.poc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TestCalculator {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){

        assertEquals(4, calculator.add(2, 2));

    }

    @Test
    public void testSubtract() {
        assertEquals(0, calculator.subtract(2, 2));
    }

}