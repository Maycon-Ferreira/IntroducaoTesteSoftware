package ex_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Contains unit tests for class {@code FindLast}.
 */
class FindLastTest {
    /**
     * Tests the given method with the given array, value and expected output.
     */
    @Test
    void findLast() {
        int[] haystack = new int[]{2, 3, 5};
        int needle = 2;

        assertEquals(FindLast.findLast(haystack, needle), 0);
    }

    /**
     * Tests the fixed method with the given array, value and expected output.
     */
    @Test
    void findLastFixed() {
        int[] haystack = new int[]{2, 3, 5};
        int needle = 2;

        assertEquals(FindLast.findLastFixed(haystack, needle), 0);
    }
}