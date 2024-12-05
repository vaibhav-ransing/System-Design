package CP.CodeChef;

import java.util.Arrays;

public class NiceArray {

    public boolean soln(int[] arr, int k) {

        int min = Arrays.stream(arr)
                .map(val -> (int) Math.floor((double) val / k))
                .sum();
        int max = Arrays.stream(arr)
                .map(val -> (int) Math.ceil((double) val / k))
                .sum();

        if (min <= 0 && max >= 0)
            return true;
        return false;
    }
}
