package ex2_1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * A class containing unit tests for class {@code Union}.
 */
class UnionTest {
    /**
     * Tests if resulting union does not contain duplicates.
     */
    @Test
    void unionDoesNotContainDuplicates() {
        Vector<Object> a = new Vector<>(Arrays.asList(1, 1));
        Vector<Object> b = new Vector<>(Arrays.asList(1, 2, 3));

        Vector<Object> unionWithoutDuplicates = new Vector<>(Arrays.asList(1, 2, 3));

        assertEquals(Union.union(a, b), unionWithoutDuplicates);
    }

    /**
     * Tests if {@code Union.union(a, b)} method does not throw {@code NullPointerException} when both {@code a} and {@code b} are {@code null}.
     */
    @Test
    void unionDoesNotThrowNPEWhenAAndBAreNull() {
        Vector<Object> emptyVector = new Vector<>();

        try {
            assertEquals(Union.union(null, null), emptyVector);
        } catch (NullPointerException e) {
            fail("A NullPointerException occurred.");
        }
    }

    /**
     * Tests if {@code Union.union(a, b)} method does not throw {@code NullPointerException} when {@code a} is {@code null}.
     */
    @Test
    void unionDoesNotThrowNPEWhenAIsNull() {
        Vector<Object> b = new Vector<>(Arrays.asList(1, 2, 3));

        try {
            assertEquals(Union.union(null, b), b);
        } catch (NullPointerException e) {
            fail("A NullPointerException occurred.");
        }
    }

    /**
     * Tests if {@code Union.union(a, b)} method does not throw {@code NullPointerException} when {@code b} is {@code null}.
     */
    @Test
    void unionDoesNotThrowNPEWhenBIsNull() {
        Vector<Object> a = new Vector<>(Arrays.asList(1, 2, 3));

        try {
            assertEquals(Union.union(a, null), a);
        } catch (NullPointerException e) {
            fail("A NullPointerException occurred.");
        }
    }

    /**
     * Tests if resulting union does not contain the element {@code null}.
     */
    @Test
    void unionDoesNotContainNull() {
        Vector<Object> a = new Vector<>(Arrays.asList(null, 1));
        Vector<Object> b = new Vector<>(Arrays.asList(2, 3));

        Vector<Object> unionWithoutNull = new Vector<>(Arrays.asList(1, 2, 3));

        assertEquals(Union.union(a, b), unionWithoutNull);
    }

    /**
     * Tests if resulting fixed union does not contain duplicates.
     */
    @Test
    void unionFixedDoesNotContainDuplicates() {
        Vector<Object> a = new Vector<>(Arrays.asList(1, 1));
        Vector<Object> b = new Vector<>(Arrays.asList(1, 2, 3));

        HashSet<Object> unionWithoutDuplicates = new HashSet<>(Arrays.asList(1, 2, 3));

        assertEquals(Union.unionFixed(a, b), unionWithoutDuplicates);
    }


    /**
     * Tests if {@code unionFixed} method does not throw {@code NullPointerException} when {@code a} and {@code b} are {@code null}.
     */
    @Test
    void unionFixedDoesNotThrowNPEWhenAAndBAreNull() {
        HashSet<Object> emptyVector = new HashSet<>();

        try {
            assertEquals(Union.unionFixed(null, null), emptyVector);
        } catch (NullPointerException e) {
            fail("A NullPointerException occurred.");
        }
    }


    /**
     * Tests if {@code unionFixed} method does not throw {@code NullPointerException} when {@code a} is {@code null}.
     */
    @Test
    void unionFixedDoesNotThrowNPEWhen_A_IsNull() {
        HashSet<Object> b = new HashSet<>(Arrays.asList(1, 2, 3));

        try {
            assertEquals(Union.unionFixed(null, b), b);
        } catch (NullPointerException e) {
            fail("A NullPointerException occurred.");
        }
    }


    /**
     * Tests if {@code unionFixed} method does not throw {@code NullPointerException} when {@code b} is {@code null}.
     */
    @Test
    void unionFixedDoesNotThrowNPEWhen_B_IsNull() {
        HashSet<Object> a = new HashSet<>(Arrays.asList(1, 2, 3));

        try {
            assertEquals(Union.unionFixed(a, null), a);
        } catch (NullPointerException e) {
            fail("A NullPointerException occurred.");
        }
    }

    /**
     * Tests if resulting fixed union does not contain the element {@code null}.
     */
    @Test
    void unionFixedDoesNotContainNull() {
        Vector<Object> a = new Vector<>(Arrays.asList(null, 1));
        Vector<Object> b = new Vector<>(Arrays.asList(2, 3));

        HashSet<Object> unionWithoutNull = new HashSet<>(Arrays.asList(1, 2, 3));

        assertEquals(Union.unionFixed(a, b), unionWithoutNull);
    }
}