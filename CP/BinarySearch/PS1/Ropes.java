package BinarySearch.PS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://codeforces.com/edu/course/2/lesson/6/2/practice/contest/283932/problem/B
public class Ropes {

    static void solution(int[] arr, int k) {
        double low = 0, high = 1e8;
        double precision = 0.00000001;
        int count = 100;
        while (count-- > 0) {
            double mid = low + (high - low) / 2.0;
            if (check(mid, arr, k)) {
                low = mid;
            } else {
                high = mid;
            }
        }
        double roundedNumber = Math.round(high * 10000000) / 10000000.0;
        System.out.println(roundedNumber);
    }

    static boolean check(double mid, int[] arr, int k) {
        int count = 0;
        for (int val : arr) {
            count += val / mid;
        }
        return count >= k;
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int n = fr.nextInt(); // Number of test cases
        int k = fr.nextInt(); // Number of test cases

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextInt();
        }
        solution(arr, k);

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
