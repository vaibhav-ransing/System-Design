package BinarySearch.Day3;

import java.io.*;
import java.util.*;

public class WormsCF {

    public static void solution(int[] arr, int[] queries) {
        int n = arr.length;
        int[] ps = new int[n];
        ps[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ps[i] += ps[i - 1] + arr[i];
        }
        for (int q : queries) {
            int pile = pileFinder(ps, q);
            System.out.println(pile + 1);
        }
    }

    public static int pileFinder(int[] ps, int q) {
        if (q <= ps[0])
            return 0;
        int low = 1, high = ps.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ps[mid] >= q) {
                if (ps[mid - 1] < q)
                    return mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();

        int n = fr.nextInt(); // Number of boxes
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = fr.nextInt(); // Numbers on each box
        }

        int m = fr.nextInt(); // Number of boxes
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = fr.nextInt(); // Numbers on each box
        }

        solution(a, queries);
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
