package problem102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import model.TreeNode;

public class Solution102 {

    public static List<List<Integer>> integerList;

    public static List<List<Integer>> levelOrder(TreeNode root) {
        integerList = new ArrayList<>();
        bfs(root, 0);
        return integerList;
    }

    public static void bfs(TreeNode treeNode, int level) {
        if (treeNode == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>(); // BFS를 위한 Queue
        queue.offer(treeNode);

        while (!queue.isEmpty()) {
            List<Integer> visited = new ArrayList<>();

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll(); // queue에서 꺼낸 TreeNode 
                visited.add(node.val); // val 저장

                if (node.left != null) { // left
                    queue.add(node.left);
                }
                if (node.right != null) { // right
                    queue.add(node.right);
                }
            }
            integerList.add(visited);
        }
        return;
    }

    public static void run() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> list = new ArrayList<>();
        list = levelOrder(root);

        for (List<Integer> i : list) {
            System.out.println(i);
        }
    }
}
