package dev.symoh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class regularCalculatorTest {
    regularCalculator regularCalculator=new regularCalculator();

    @Test
    void sum() {
        regularCalculator.setX(3);
        regularCalculator.setY(4);
        assertEquals(7,regularCalculator.sum());
    }

    @Test
    void subtract() {
        regularCalculator.setX(8);
        regularCalculator.setY(2);
        assertEquals(6,regularCalculator.subtract());
    }

    @Test
    void multiply() {
        regularCalculator.setX(4);
        regularCalculator.setY(4);
        assertEquals(16,regularCalculator.multiply());
    }

    @Test
    void divide() {
        regularCalculator.setX(12);
        regularCalculator.setY(4);
        assertEquals(3,regularCalculator.divide());
    }
}