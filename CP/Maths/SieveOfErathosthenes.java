package CP.Maths;

import java.util.Arrays;

public class SieveOfErathosthenes {
    public static boolean checkPrimeN(int n) {
        for (int fac = 2; fac <= n / 2; fac++) {
            if (n % fac == 0)
                return false;
        }
        return true;
    }

    public static boolean checkPrimeSqrtN(int n) {
        for (int fac = 2; fac * fac <= n; fac++) {
            if (n % fac == 0)
                return false;
        }
        return true;
    }

    // Find all prime numbers up to n
    private static void soln(int n) {
        if (n < 2) {
            System.out.println("No primes below 2.");
            return;
        }

        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        arr[0] = false; // 0 is not prime
        arr[1] = false; // 1 is not prime

        // Implement the Sieve of Eratosthenes
        // O(n * O(log(log(n))))
        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                // Mark all multiples of i as non-prime
                for (int j = 2; j * i < n; j++) {
                    arr[i * j] = false;
                }
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        soln(10);
    }
}
