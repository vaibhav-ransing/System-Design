package BinarySearch.Day2;

import java.util.Arrays;

public class Baunquets {

    public int minDays(int[] arr, int m, int k) {
        int l = 1, r = Arrays.stream(arr).max().orElse(0);
        int ans = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (helper(arr, m, k, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public boolean helper(int[] arr, int m, int k, int day) {
        int count = 0;
        int bonq = 0;
        for (int val : arr) {
            if (val <= day) {
                count++;
            } else {
                bonq += count / k;
                count = 0;
            }
        }
        bonq += count / k;
        return bonq >= m;
    }
}
