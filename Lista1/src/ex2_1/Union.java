package ex2_1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * Contains a defective and a fixed method for getting the union of two collections.
 */
public class Union {
    private Union() {
    }

    /**
     * Defective vector union method.
     *
     * @param a A {@code Vector} of objects.
     * @param b Another {@code Vector} of objects.
     * @return A {@code Vector} containing elements of both {@code a} and {@code b}.
     */
    public static Vector union(Vector a, Vector b) {
        Vector union = new Vector(a);

        for (Object obj : b) {
            if (!union.contains(obj)) {
                union.add(obj);
            }
        }

        return union;
    }

    /**
     * Fixed collection union method.
     *
     * @param a A {@code Collection} of objects.
     * @param b Another {@code Collection} of objects.
     * @param <E> The type of elements maintained by the collections.
     * @return A {@code Set} containing the union of {@code a} and {@code b} excluding {@code null} elements;<br>
     * A {@code Set} containing the elements of the other collection if either of the parameters are {@code null};<br>
     * A empty {@code Set} if both parameters are {@code null}.
     */
    public static <E> Set<E> unionFixed(Collection<? extends E> a, Collection<? extends E> b) {
        Set<E> union = new HashSet<>();

        if (a != null) {
            union.addAll(a);
        }
        if (b != null) {
            union.addAll(b);
        }
        union.remove(null);

        return union;
    }
}


