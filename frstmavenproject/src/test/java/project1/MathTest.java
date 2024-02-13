package project1;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    public void testAddition() {
        Calculations calc = new Calculations();
        assertEquals(calc.add(10, 8), 18);
    }

    @Test
    public void testSubtraction() {
        Calculations calc = new Calculations();
        assertEquals(calc.sub(10, 8), 2);
    }

    @Test
    public void testMultiplication() {
        Calculations calc = new Calculations();
        assertEquals(calc.multiply(5, 4), 20);
    }

    @Test
    public void testDivision() {
        Calculations calc = new Calculations();
        assertEquals(calc.divide(15, 3), 5);
    }
}

