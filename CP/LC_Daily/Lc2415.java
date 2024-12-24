package LC_Daily;

import java.util.ArrayDeque;
import java.util.ArrayList;

import javax.lang.model.type.IntersectionType;
import javax.swing.tree.TreeNode;

public class Lc2415 {
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

    public TreeNode reverseOddLevels(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        int count = 0;
        queue.add(root);
        while (queue.size() > 0) {
            ArrayDeque<TreeNode> clone = queue.clone();

            while (clone.size() > 1 && ((count & 1) == 1)) {
                TreeNode leftMost = clone.removeFirst();
                TreeNode rightMost = clone.removeLast();
                int tempVal = leftMost.val;
                leftMost.val = rightMost.val;
                rightMost.val = tempVal;
            }

            int size = queue.size();
            while (size-- > 0) {
                TreeNode node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            count++;
        }
        return root;
    }
}
