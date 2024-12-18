import java.util.Stack;

public class Lc2182 {

    public String repeatLimitedString(String s, int repeatLimit) {
        // PriorityQueue<int[]> pq = new Prio
        return "";
    }

    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        ans[n - 1] = prices[n - 1];
        Stack<Integer> stack = new Stack<>();
        stack.push(prices[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            int cv = prices[i];
            while (stack.size() > 0 && cv < stack.peek()) {
                stack.pop();
            }
            if (stack.size() > 0) {
                ans[i] = cv - stack.peek();
            } else {
                ans[i] = cv;
            }
            stack.push(cv);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}