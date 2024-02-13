package project1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MathOperationsTest {

    @ParameterizedTest
    @CsvSource({ "2, 3, 5", "-2, -3, -5", "0, 0, 0" })
    void testAddition(int a, int b, int expected) {
        assertEquals(expected, MathOperations.add(a, b));
    }

    @ParameterizedTest
    @CsvSource({ "4, 3, 1", "2, -3, 5", "0, 0, 0" })
    void testSubtraction(int a, int b, int expected) {
        assertEquals(expected, MathOperations.subtract(a, b));
    }

    @ParameterizedTest
    @CsvSource({ "2, 3, 6", "2, -3, -6", "0, 0, 0" })
    void testMultiplication(int a, int b, int expected) {
        assertEquals(expected, MathOperations.multiply(a, b));
    }

    @ParameterizedTest
    @CsvSource({ "6, 3, 2", "6, -3, -2" })
    void testDivision(int a, int b, int expected) {
        assertEquals(expected, MathOperations.divide(a, b));
    }
}