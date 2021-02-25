package training;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleNbTest {

    @Test
    public void test1() {
        assertTrue(DivisibleNb.isDivisible(15,5,3));
    }
    @Test
    public void test2() {
        assertFalse(DivisibleNb.isDivisible(4,3,4));
    }
}