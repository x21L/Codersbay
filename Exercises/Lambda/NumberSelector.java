import java.util.Arrays;

@FunctionalInterface
public interface NumberSelector {
    boolean check(int number);

    static int[] findFirst(NumberSelector numberSelector, int n) {
        if (numberSelector == null) {
            throw new IllegalArgumentException("numberSelector must not be null");
        } else if (n == 0) {
            throw new IllegalArgumentException("n must be > 0");
        }

        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i <= 1000000 && index < n; i++) {
            if (numberSelector.check(i)) {
                result[index++] = i;
            }
        }
        if (index < result.length) {
            result = Arrays.copyOf(result, index);
        }
        return result;
    }
}
