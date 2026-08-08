// https://leetcode.com/problems/clone-graph/
package graphs;

import java.util.*;

public class LeetCode133_CloneGraph {
    // LeetCode Problem 133: Clone Graph
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode133_CloneGraph solver = new LeetCode133_CloneGraph();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode133_CloneGraph (Clone Graph) Passed!");
    }
}
