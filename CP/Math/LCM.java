package Math;

public class LCM {

    private long lcm(int a, int b) {
        
        return (long) a * (b / gcd(a, b));
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
