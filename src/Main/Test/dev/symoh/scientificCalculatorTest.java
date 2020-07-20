package dev.symoh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class scientificCalculatorTest {
    scientificCalculator scientificCalculator=new scientificCalculator();

    @Test
    void factorial() {
        scientificCalculator.setX(4);
        assertEquals(24,scientificCalculator.factorial());
    }

    @Test
    void tan() {
        scientificCalculator.setX(90);
        assertEquals(-1.995200412208242,scientificCalculator.tan());
    }

    @Test
    void sin() {
        scientificCalculator.setX(60);
        assertEquals(-0.3048106211022167,scientificCalculator.sin());
    }

    @Test
    void cos() {
        scientificCalculator.setX(120);
        assertEquals(0.8141809705265618,scientificCalculator.cos()
        );
    }

    @Test
    void log() {
        scientificCalculator.setX(100);
        assertEquals(4.605170185988092,scientificCalculator.log());
    }

    @Test
    void sq() {
        scientificCalculator.setX(2);
        assertEquals(4,scientificCalculator.sq());
    }
}