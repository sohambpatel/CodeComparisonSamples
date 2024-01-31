package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorDiffblueTest {
    /**
     * Method under test:
     * {@link Calculator#calculateBi(Calculator.BiOperatorModes, Double)}
     */
    @Test
    void testCalculateBi() {
        // Arrange, Act and Assert
        assertEquals(Double.NaN, (new Calculator()).calculateBi(Calculator.BiOperatorModes.normal, 10.0d).doubleValue());
        assertEquals(Double.NaN, (new Calculator()).calculateBi(Calculator.BiOperatorModes.add, 10.0d).doubleValue());
        assertEquals(Double.NaN, (new Calculator()).calculateBi(Calculator.BiOperatorModes.minus, 10.0d).doubleValue());
        assertEquals(Double.NaN, (new Calculator()).calculateBi(Calculator.BiOperatorModes.multiply, 10.0d).doubleValue());
        assertEquals(Double.NaN, (new Calculator()).calculateBi(Calculator.BiOperatorModes.divide, 10.0d).doubleValue());
        assertEquals(Double.NaN, (new Calculator()).calculateBi(Calculator.BiOperatorModes.xpowerofy, 10.0d).doubleValue());
    }

    /**
     * Method under test: {@link Calculator#calculateEqual(Double)}
     */
    @Test
    void testCalculateEqual() {
        // Arrange, Act and Assert
        assertEquals(Double.NaN, (new Calculator()).calculateEqual(10.0d).doubleValue());
    }

    /**
     * Method under test: {@link Calculator#reset()}
     */
    @Test
    void testReset() {
        // Arrange, Act and Assert
        assertEquals(Double.NaN, (new Calculator()).reset().doubleValue());
    }

    /**
     * Method under test:
     * {@link Calculator#calculateMono(Calculator.MonoOperatorModes, Double)}
     */
    @Test
    void testCalculateMono() {
        // Arrange, Act and Assert
        assertEquals(100.0d, (new Calculator()).calculateMono(Calculator.MonoOperatorModes.square, 10.0d).doubleValue());
        assertEquals(3.1622776601683795d,
                (new Calculator()).calculateMono(Calculator.MonoOperatorModes.squareRoot, 10.0d).doubleValue());
        assertEquals(0.1d,
                (new Calculator()).calculateMono(Calculator.MonoOperatorModes.oneDividedBy, 10.0d).doubleValue());
        assertEquals(0.984807753012208d,
                (new Calculator()).calculateMono(Calculator.MonoOperatorModes.cos, 10.0d).doubleValue());
        assertEquals(0.17364817766693033d,
                (new Calculator()).calculateMono(Calculator.MonoOperatorModes.sin, 10.0d).doubleValue());
        assertEquals(0.17632698070846498d,
                (new Calculator()).calculateMono(Calculator.MonoOperatorModes.tan, 10.0d).doubleValue());
        assertEquals(1.0d, (new Calculator()).calculateMono(Calculator.MonoOperatorModes.log, 10.0d).doubleValue());
        assertEquals(2.302585092994046d,
                (new Calculator()).calculateMono(Calculator.MonoOperatorModes.ln, 10.0d).doubleValue());
        assertEquals(0.1d, (new Calculator()).calculateMono(Calculator.MonoOperatorModes.rate, 10.0d).doubleValue());
        assertEquals(10.0d, (new Calculator()).calculateMono(Calculator.MonoOperatorModes.abs, 10.0d).doubleValue());
        assertEquals(0.0d, (new Calculator()).calculateMono(Calculator.MonoOperatorModes.tan, 180.0d).doubleValue());
        assertEquals(Double.NaN, (new Calculator()).calculateMono(Calculator.MonoOperatorModes.tan, 90.0d).doubleValue());
        assertEquals(0.0d, (new Calculator()).calculateMono(Calculator.MonoOperatorModes.tan, 0.0d).doubleValue());
    }
}
