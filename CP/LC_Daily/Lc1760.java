package LC_Daily;

import java.util.PriorityQueue;

public class Lc1760 {
    public int minimumSize(int[] nums, int maxOperations) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Math.ceilDiv(b[0], b[1]) - Math.ceilDiv(a[0], a[1]));

        for (int val : nums) {
            pq.add(new int[] { val, 1 });
        }
        System.out.println(pq.peek()[0] + " ");
        while (maxOperations-- > 0) {
            int[] peek = pq.remove();
            peek[1]++;
            pq.add(peek);
        }

        return Math.ceilDiv(pq.peek()[0], pq.peek()[1]);
    }

}
