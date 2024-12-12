package BinarySearch.Day2;

public class UglyNo3 {
    class Solution {

        public int nthUglyNumber(int n, int a, int b, int c) {
            long low = 1, high = Long.MAX_VALUE;

            long ab = lcm(a, b), bc = lcm(b, c), ca = lcm(c, a), abc = lcm(a, (int) bc);

            while (low <= high) {
                long mid = low + (high - low) / 2;

                long count = mid / a + mid / b + mid / c
                        - mid / ab - mid / bc - mid / ca
                        + mid / abc;

                if (count >= n) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return (int) low;
        }

        public long lcm(int a, int b) {
            return (long) a * (b / gcd(a, b));
        }

        public int gcd(int a, int b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }
    }

}
