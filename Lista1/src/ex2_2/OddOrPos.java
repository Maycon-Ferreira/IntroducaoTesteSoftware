package ex2_2;

/**
 * Contains a defective and a fixed method for counting all odd or positive elements of an array.
 */
public class OddOrPos {
    private OddOrPos() {
    }

    /**
     * Defective method for counting all odd or positive elements of an array.
     *
     * @param x array to search.
     * @return count of positive elements in {@code x}.
     * @throws NullPointerException if {@code x} is {@code null}.
     */
    public static int oddOrPos(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 1 || x[i] > 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Fixed method for counting all odd or positive elements of an array.
     *
     * @param x array to search.
     * @return count of positive elements in {@code x}.
     * @throws NullPointerException if {@code x} is {@code null}.
     */
    public static int oddOrPosFixed(int[] x) {
        int count = 0;
        for (int value : x) {
            if (Math.abs(value % 2) == 1 || value > 0) {
                count++;
            }
        }
        return count;
    }
}
