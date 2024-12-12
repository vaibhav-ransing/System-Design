package LC_Daily;

import java.util.Arrays;

public class Lc3152 {

    public boolean[] isArraySpecial(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefix = new int[n];
        for (int i = 1; i < n; i++) {
            prefix[i] += prefix[i - 1];
            if ((arr[i - 1] + arr[i]) % 2 == 0) {
                prefix[i]++;
            }
        }
        boolean[] ans = new boolean[queries.length];
        int i = 0;
        System.out.println(Arrays.toString(prefix));
        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            int count = l == 0 ? prefix[r] : prefix[r] - prefix[l - 1];
            ans[i++] = count == 0;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}