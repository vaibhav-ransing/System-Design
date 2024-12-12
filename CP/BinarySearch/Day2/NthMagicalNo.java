package BinarySearch.Day2;

public class NthMagicalNo {
    public int nthMagicalNumber(int n, int a, int b) {
        long low = Math.min(a, b), high = (long) 1e18; // Limit for binary search
        long mod = 1_000_000_007;

        while (low < high) {
            long mid = low + (high - low) / 2;
            if (count(mid, a, b) >= n) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return (int) (low % mod);
    }

    // a and b are fixed why calculate lcm again and again
    // pass it as argument from main fun.
    private long count(long mid, int a, int b) {
        long lcm = lcm(a, b);
        return (mid / a) + (mid / b) - (mid / lcm);
    }

    private long lcm(int a, int b) {
        return (long) (a * b) / gcd(a, b);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
