package dev.symoh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class binaryCalculatorTest {
    binaryCalculator binaryCalculator=new binaryCalculator();

    @Test
    void binaryToDecimal() {
        assertEquals(31,binaryCalculator.binaryToDecimal(11111));
    }

    @Test
    void decimalToBinary() {
        assertEquals(11110,binaryCalculator.decimalToBinary(30));
    }

    @Test
    void sum() {
        binaryCalculator.setX(111);
        binaryCalculator.setY(1010);
        assertEquals(10001,binaryCalculator.sum());
    }

    @Test
    void subtract() {
        binaryCalculator.setX(1111);
        binaryCalculator.setY(101);
        assertEquals(1010,binaryCalculator.subtract());
    }

    @Test
    void multiply() {
        binaryCalculator.setX(111);
        binaryCalculator.setY(10);
        assertEquals(1110,binaryCalculator.multiply());
    }

    @Test
    void divide() {
        binaryCalculator.setX(1111);
        binaryCalculator.setY(101);
        assertEquals(11,binaryCalculator.divide());
    }
}