package LC_Daily;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lc3376 {
    public int findMinimumTime(List<Integer> strength, int k) {
        Collections.sort(strength);

        int time = 0;
        int currStr = 0;
        int x = 1;
        for (int str : strength) {
            while (str > currStr) {
                time++;
                currStr += x;
            }
            currStr = 0;
            currStr += k;
        }
        return time;
    }
}
