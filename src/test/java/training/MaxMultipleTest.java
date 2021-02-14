package training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMultipleTest {

    @Test
    void shouldReturnMaxMultiple(){
        int testDivisor = 8;
        int testBound = 84;
        int testResult = 80;

        assertEquals(testResult, MaxMultiple.maxMultiple(testDivisor, testBound));

    }


}