package BinarySearch.Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrayDivision {

    public static void solution(long[] nums, long k) {
        long high = Arrays.stream(nums).sum();
        long low = Arrays.stream(nums).max().orElse(Integer.MAX_VALUE);
        while (low <= high) {
            long mid = (low + high) / 2;
            if (canSplit(nums, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(low);
    }

    public static boolean canSplit(long[] arr, long k, long maxSumInSubArr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            long cv = arr[i];
            if (cv > maxSumInSubArr)
                return false;
            if (sum + cv > maxSumInSubArr) {
                k--;
                sum = cv;
            } else {
                sum += cv;
            }
        }
        return k >= 1;
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        long n = fr.nextLong();
        long k = fr.nextLong();
        long[] a = new long[(int) n];

        for (int i = 0; i < n; i++) {
            a[i] = fr.nextLong();
        }
        solution(a, k);

    }

    // FastReader class for efficient input
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
