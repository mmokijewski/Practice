package training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfEvenNumbersTest {

    @Test
    void shouldReturn1IfInput0() {
        int testInput = 0;
        int testOutput = 1;

        assertEquals(testOutput, ProductOfEvenNumbers.countExpression(testInput));
    }

    @Test
    void shouldReturn1IfInput1() {
        int testInput = 1;
        int testOutput = 1;

        assertEquals(testOutput, ProductOfEvenNumbers.countExpression(testInput));
    }

    @Test
    void value5() {
        int testInput = 5;
        int testOutput = 8;

        assertEquals(testOutput, ProductOfEvenNumbers.countExpression(testInput));
    }

    @Test
    void value6() {
        int testInput = 6;
        int testOutput = 48;

        assertEquals(testOutput, ProductOfEvenNumbers.countExpression(testInput));
    }

    @Test
    void minusValue() {
        int testInput = -6;
        int testOutut = 0;

        assertEquals(testOutut, ProductOfEvenNumbers.countExpression(testInput));
    }

    @Test
    void doubleValue() {
        double testInput = 7.84;

        assertEquals("Please input only natural number", ProductOfEvenNumbers.countExpression(testInput));
    }
}