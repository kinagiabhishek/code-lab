// https://leetcode.com/problems/clone-graph/
package graphs;
import java.util.*;
public class LeetCode133_CloneGraph {
    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node(int _val) { val = _val; neighbors = new ArrayList<>(); }
    }
    private Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if (map.containsKey(node)) return map.get(node);
        Node copy = new Node(node.val);
        map.put(node, copy);
        for (Node n : node.neighbors) copy.neighbors.add(cloneGraph(n));
        return copy;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        assert new LeetCode133_CloneGraph().cloneGraph(n1).val == 1;
        System.out.println("✅ LeetCode133_CloneGraph Passed!");
    }
}
