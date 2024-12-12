package BinarySearch.Day1;

import java.util.Scanner;

public class MultiplicationTableMedian {
    public static long findMedian(long n) {
        // Binary search on the range of possible values
        long left = 1, right = n * n;

        while (left < right) {
            long mid = left + (right - left) / 2;

            // Count elements less than or equal to mid in the multiplication table
            if (countSmallerOrEqual(n, mid) < (long) (n * n + 1) / 2) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println(left);
        return left;
    }

    // Count how many elements in the n x n multiplication table
    // are less than or equal to the given value
    private static long countSmallerOrEqual(long n, long x) {
        long count = 0;
        for (int i = 1; i <= n; i++) {
            // For each row, count elements <= x
            count += Math.min(x / i, n);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        findMedian(n);
    }
}