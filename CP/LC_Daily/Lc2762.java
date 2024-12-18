package LC_Daily;

import java.util.PriorityQueue;

public class Lc2762 {
    public long continuousSubarrays(int[] arr) {
        long count = 0;

        int l = 0;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1])); 
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1])); 

        for (int r = 0; r < arr.length; r++) {
            int cv = arr[r];
            minHeap.add(new int[] { r, cv });
            maxHeap.add(new int[] { r, cv });

            while (maxHeap.peek()[1] - minHeap.peek()[1] > 2) {
                l++;
                while (minHeap.size() > 0 && minHeap.peek()[0] < l) {
                    minHeap.remove();
                }
                while (maxHeap.size() > 0 && maxHeap.peek()[0] < l) {
                    maxHeap.remove();
                }
            }
            count += r - l + 1;
        }

        return count;
    }
}