package LC_Daily;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Lc2054 {
    class Solution {
        public int maxTwoEvents(int[][] events) {
            Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
            int maxVal = 0, ans = 0;

            for (int[] event : events) {
                int start = event[0], end = event[1], value = event[2];

                // Remove all events that end before the current event's start time
                while (!pq.isEmpty() && pq.peek()[0] < start) {
                    maxVal = Math.max(maxVal, pq.poll()[1]);
                }

                // Update the maximum sum of values
                ans = Math.max(ans, maxVal + value);

                // Add the current event to the priority queue
                pq.offer(new int[] { end, value });
            }

            return ans;
        }
    }

    public int maxTwoEvents(int[][] events) {
        int n = events.length;

        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        int[] suf = new int[n];
        suf[n - 1] = events[n - 1][2];
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = Math.max(suf[i + 1], events[i][2]);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int low = i + 1, high = n - 1;
            int nextIdx = -1;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (events[i][1] < events[mid][0]) { // end < start
                    nextIdx = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            int curr = events[i][2];
            int next = nextIdx == -1 ? 0 : events[nextIdx][2];
            ans = Math.max(ans, curr + next);
        }
        return ans;
    }
}
