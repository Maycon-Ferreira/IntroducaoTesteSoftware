package ex2_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A class containing the unit tests for class {@code CountPositive}.
 */
class CountPositiveTest {
    /**
     * Tests the given method with the given array and expected output.
     */
    @Test
    void countPositive() {
        assertEquals(CountPositive.countPositive(new int[]{-4, 2, 0, 2}), 2);
    }

    /**
     * Tests the fixed method with the given array and expected output.
     */
    @Test
    void countPositiveFixed() {
        assertEquals(CountPositive.countPositiveFixed(new int[]{-4, 2, 0, 2}), 2);
    }
}