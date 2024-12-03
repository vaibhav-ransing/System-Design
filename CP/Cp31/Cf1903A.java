package CP.Cp31;

import java.io.*;
import java.util.*;

public class Cf1903A {

    public static String canSort(int[] arr, int k) {
        if (k > 1) {
            return "YES";
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    return "NO";
                }
            }
            return "YES";
        }
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int t = fr.nextInt(); // Number of test cases

        for (int tc = 0; tc < t; tc++) {
            int n = fr.nextInt(); // Number of boxes
            int k = fr.nextInt(); // Maximum length of reverse
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = fr.nextInt(); // Numbers on each box
            }

            // Process the test case here
            System.out.println(canSort(a, k));
        }
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
