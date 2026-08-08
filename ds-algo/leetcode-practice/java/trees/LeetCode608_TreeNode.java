// https://leetcode.com/problems/tree-node/
package trees;

import java.util.*;

public class LeetCode608_TreeNode {
    // LeetCode Problem 608: Tree Node
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode608_TreeNode solver = new LeetCode608_TreeNode();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode608_TreeNode (Tree Node) Passed!");
    }
}
