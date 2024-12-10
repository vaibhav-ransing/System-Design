package LC_Daily;

import java.util.Arrays;
import java.util.HashSet;

public class Lc2554 {

    public int maxCount(int[] banned, int n, int maxSum) {
        if (maxSum <= 1)
            return 0;
        Arrays.sort(banned);
        HashSet<Integer> set = new HashSet<>();
        for (int val : banned) {
            set.add(val);
        }
        int count = 0;
        int cs = 0;
        for (int i = 2; i < n && cs < maxSum; i++) {
            if (set.contains(i) == false) {
                System.out.println(i);
                cs += i;
                count++;
            }
        }
        return count;
    }
}
