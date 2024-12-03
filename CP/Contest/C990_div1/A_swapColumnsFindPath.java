package CP.Contest.C990_div1;

import java.util.*;
import java.io.*;

public class A_swapColumnsFindPath {

    public static int solution(int[][] arr, int n) {
        int min = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int max = Math.max(arr[0][i], arr[1][i]);
            int currMin = Math.min(arr[0][i], arr[1][i]);
            if (min < currMin) {
                min = currMin;
            }
            sum += max;
        }
        sum += min;
        return sum;
    }
    // 6
    // 1 2 0 -4 -1 1
    // 1 2 -1 -3 2 4

    // 6
    // 1 2 0 -4 -1
    // 1 2 -1 -3 2
    // 5 + 1 + 2 + 0 + -3 + 2
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int t = fr.nextInt(); // Number of test cases

        for (int tc = 0; tc < t; tc++) {
            int n = fr.nextInt();
            int[][] arr = new int[2][n];
            for (int i = 0; i < n; i++) {
                arr[0][i] = fr.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr[1][i] = fr.nextInt();
            }
            System.out.println(solution(arr, n));
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
