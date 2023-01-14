package org.campus02.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void add() {
        // das Ergebnis der Methode
        int result = Calculator.add(2, 2);
        // erwartetes Ergebnis
        int erwartet = 4;

        // Step 3: verify
        // Vergleiche erwartetes Ergebnis mit tatsächlichem
        Assertions.assertEquals(erwartet, result);
    }

    @Test
    void subtract() {
        Assertions.assertEquals(0, Calculator.subtract(2,2));
    }

    @Test
    void multiply() {
        Assertions.assertEquals(6, Calculator.subtract(2,3));
    }
}