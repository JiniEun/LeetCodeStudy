package problem589;

import java.util.ArrayList;
import java.util.List;
import model.Node;

public class Solution589 {

    public List<Integer> integerList;

    public List<Integer> preorder(Node root) {
        integerList = new ArrayList<>();
        traversal(root);
        return integerList;
    }

    public void traversal(Node node) {
        if (node == null) {
            return;
        }
        integerList.add(node.val);
        for (Node c : node.children) {
            traversal(c);
        }
    }

}
