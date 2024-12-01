package LC_Daily;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Lc2577 {

    public int minimumTime(int[][] grid) {
        if (grid[0][1] > 1 && grid[1][0] > 1)
            return -1;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        boolean[][] vis = new boolean[grid.length][grid[0].length];

        pq.add(new int[] { 0, 0, 0 });
        while (pq.size() > 0) {
            int[] curr = pq.remove();
            int r = curr[0];
            int c = curr[1];
            int cost = curr[2];

            if (r == grid.length - 1 && c == grid[0].length - 1)
                return cost;
            if (vis[r][c])
                continue;
            vis[r][c] = true;
            for (int[] d : dir) {
                int rr = r + d[0];
                int cc = c + d[1];
                if (rr >= 0 && cc >= 0 && rr < grid.length && cc < grid[0].length && !vis[rr][cc]) {
                    int nextCost = cost + 1;
                    if (nextCost < grid[rr][cc]) {
                        nextCost = grid[rr][cc];
                        if ((nextCost - cost) % 2 == 0)
                            nextCost++;
                    }
                    pq.add(new int[] { rr, cc, nextCost });
                }
            }
        }
        return -1;
    }
}
