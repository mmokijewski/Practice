package training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReversedSequenceTest {

    @Test
    void sequenceOf8() {
        int testInput = 8;
        int[] testOutput = {8, 7, 6, 5, 4, 3, 2, 1};

        assertArrayEquals(testOutput, ReversedSequence.reverse(testInput));
    }

    @Test
    void minusValue() {
        int testInput = -8;

        assertNull(ReversedSequence.reverse(testInput));
    }
}