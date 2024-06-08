// src/test/java/com/example/StringCalculatorTest.java

package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {
    @Test
    public void testEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }
    @Test
    public void testSingleNumber() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(5, calculator.add("5"));
    }

    @Test
    public void testTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("1,2"));
        assertEquals(9, calculator.add("4,5"));
    }

    @Test
    public void testMultipleNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1,2,3"));
        assertEquals(22, calculator.add("4,5,6,7"));
    }

    @Test
    public void testNewLinesBetweenNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1\n2,3"));
        assertEquals(15, calculator.add("4\n5\n6"));
    }
}
