package ex2_2;

/**
 * Contains a defective and a fixed method for counting all positive elements of an array.
 */
public class CountPositive {
    private CountPositive() {
    }

    /**
     * Defective method for counting all positive elements of an array.
     *
     * @param x Array to search.
     * @return Count of positive elements in {@code x}.
     * @throws NullPointerException if {@code x} is {@code null}.
     */
    public static int countPositive(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Fixed method for counting all positive elements of an array.
     *
     * @param x array to search.
     * @return count of positive elements in {@code x}.
     * @throws NullPointerException if {@code x} is {@code null}.
     */
    public static int countPositiveFixed(int[] x) {
        int count = 0;
        for (int value : x) {
            if (value > 0) {
                count++;
            }
        }
        return count;
    }
}
