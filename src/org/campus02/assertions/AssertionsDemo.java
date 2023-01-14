package org.campus02.assertions;

import org.junit.jupiter.api.*;

public class AssertionsDemo {

    // 1. Step: Setup
    int a; // Deklaration der Variable a als int
    String s; // Deklaration der Variable s als String

    /**
     * wird vor jedem Testcase ausgeführt (gekennzeichnet mit "@Test")
     * dient dazu, um für jeden Test benötigte Ressourcen zur Verfügung zu stellen
     * zB: eine Instanz einer Klasse => new Calculator()
     * oder Parameter die für jeden Test nötig sind
     */
    @BeforeEach
    void setUp() {
        a = 1; // a ist bei jedem Test 1
        s = "Hallo Welt"; // s ist bei jedem Test "Hallo Welt"
        System.out.println("before each"); // wird bei jedem Test auf die Konsole geschrieben
    }

    // 2. Step: Exercise

    /**
     * assertEquals(expected, actual)
     * nimmt einen erwarteten Wert entgegen (was erwartet sich der Programmierer)
     * und einen aktuellen Wert (den Wert den die zu testenden Methode retourniert)
     * => kurz gesagt, es werden 2 Werte miteinander verglichen
     */
    @Test
    @DisplayName("Test asssertEquals")
    void abcTest() {
        int actual = 1;

        // 3. Step: Verify
        Assertions.assertEquals(a, actual);
    }

    /**
     * Überprüft, ob die Bedingung zutrifft
     */
    @Test
    void assertTrueTest() {
        String halloWelt = "hallo welt";
        String lower = s.toLowerCase();

        Assertions.assertTrue(halloWelt.equals(lower));
        Assertions.assertTrue(a > 0);
    }

    // Es wird geprüft, ob die Bedingung falsch ist
    // sprich, das Gegenteil von assertTrue()
    @Test
    void assertFalseTest() {
        Assertions.assertFalse(a < 0);
    }

    @Test
    void assertThrowsTest() {
        int[] array = new int[1];

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int i = array[1];
        });

    }



    // 4. Step: tear-Down
    @AfterEach
    void tearDown() {
        // wird nach jedem Testcase ausgeführt
        // um eventuell offenen Schnittstellen/Komponenten (zB: DB) zu schließen
        System.out.println("after each");
    }
}
