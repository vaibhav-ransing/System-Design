package CP;

import java.util.*;
import java.io.*;

public class CodeforcesTemplate {

    
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
            System.out.println("Test case " + (tc + 1));
            System.out.println("n: " + n + ", k: " + k);
            System.out.println("Array: " + Arrays.toString(a));
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

