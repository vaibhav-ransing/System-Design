package LC_Daily;

import java.util.*;
import java.util.stream.*;

public class LC2471 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int minimumOperations(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int ans = 0;
        while (queue.size() > 0) {
            int k = queue.size();
            ArrayDeque<Integer> queueInteger = queue.stream()
                    .map(node -> node.val)
                    .collect(Collectors.toCollection(ArrayDeque::new));
            ans += getNumberOfSwaps(queueInteger);
            while (k-- > 0) {
                TreeNode node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return ans;
    }

    ArrayList<ArrayList<Integer>> graph;

    public int getNumberOfSwaps(ArrayDeque<Integer> queue) {
        int[] arr = new int[queue.size()];
        int n = arr.length;
        graph = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> graph.add(new ArrayList<>()));
    
        // Populate array and create a map for index lookup
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        while (!queue.isEmpty()) {
            int cv = queue.remove();
            arr[idx] = cv;
            map.put(cv, idx);
            idx++;
        }
    
        // Create sorted version of the array
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
    
        // Construct the graph based on mismatched positions
        for (int i = 0; i < n; i++) {
            int cv = sortedArr[i];
            int ogIdx = map.get(cv);
            if (ogIdx != i) {
                graph.get(ogIdx).add(i);
                graph.get(i).add(ogIdx);
            }
        }
    
        System.out.println("Graph: " + graph);
    
        // Detect cycles in the graph and count the number of swaps needed
        boolean[] vis = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                ans += (getCycleSize(i, vis) - 1); // Count cycles
            }
        }
        return ans;
    }
    

    public int getCycleSize(int idx, boolean[] visited) {
        if (visited[idx]) return 0; 
        visited[idx] = true;       
        int count = 1;             
        for (int nbr : graph.get(idx)) {
            if (!visited[nbr]) {
                count += getCycleSize(nbr, visited); 
            }
        }
        return count;
    }
    

}
