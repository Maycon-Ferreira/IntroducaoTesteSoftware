package ex_1;

/**
 * Contains a defective and a fixed method for getting the index of the last occurrence of an element in an array.
 */
public class FindLast {
    private FindLast() {
    }

    /**
     * @param x Array to search.
     * @param y Value to look for.
     * @return Last index of {@code y} in {@code x}, -1 if absent.
     * @throws NullPointerException if {@code x} is {@code null}.
     */
    public static int findLast(int[] x, int y) {
        for (int i = x.length - 1; i > 0; i--) {
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param haystack Array to search.
     * @param needle   Value to look for.
     * @return Last index of {@code needle} in {@code haystack}, -1 if absent.
     * @throws NullPointerException if {@code haystack} is {@code null}.
     */
    public static int findLastFixed(int[] haystack, int needle) {
        for (int i = haystack.length - 1; i >= 0; i--) {
            if (haystack[i] == needle) {
                return i;
            }
        }
        return -1;
    }
}
