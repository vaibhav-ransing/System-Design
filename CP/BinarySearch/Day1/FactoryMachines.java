package BinarySearch.Day1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FactoryMachines {

    public static void solution(long[] nums, long t) {
        if (nums == null || nums.length == 0 || t == 0) {
            System.out.println(0);
            return;
        }

        long low = 0, high = Arrays.stream(nums).min().getAsLong() * t;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (numerOfMachines(nums, mid, t)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(low);
    }

    public static boolean numerOfMachines(long[] nums, long time, long t) {
        long count = 0;
        for (long oneMachineTime : nums) {
            count += time / oneMachineTime;
        }
        return count >= t;
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        long n = fr.nextLong();
        long t = fr.nextLong();
        long[] a = new long[(int) n];

        for (int i = 0; i < n; i++) {
            a[i] = fr.nextLong();
        }
        solution(a, t);

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
