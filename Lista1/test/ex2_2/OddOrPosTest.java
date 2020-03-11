package ex2_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A class containing the unit tests for class {@code OddOrPos}.
 */
class OddOrPosTest {
    /**
     * Tests the given method with the given array and expected output.
     */
    @Test
    void oddOrPos() {
        assertEquals(OddOrPos.oddOrPos(new int[]{-3, -2, 0, 1, 4}), 3);
    }

    /**
     * Tests the fixed method with the given array and expected output.
     */
    @Test
    void oddOrPosFixed() {
        assertEquals(OddOrPos.oddOrPosFixed(new int[]{-3, -2, 0, 1, 4}), 3);
    }
}