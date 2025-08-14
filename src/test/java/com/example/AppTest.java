package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App calculator = new App();

    @Test
    void testAddition() {
        assertEquals(5.0, calculator.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1.0, calculator.subtract(3, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6.0, calculator.multiply(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.divide(6, 3));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("Cannot divide by zero!", exception.getMessage());
    }
}
