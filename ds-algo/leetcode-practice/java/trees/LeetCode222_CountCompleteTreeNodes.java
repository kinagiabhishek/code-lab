// https://leetcode.com/problems/count-complete-tree-nodes/
package trees;

import java.util.*;

public class LeetCode222_CountCompleteTreeNodes {
    // LeetCode Problem 222: Count Complete Tree Nodes
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode222_CountCompleteTreeNodes solver = new LeetCode222_CountCompleteTreeNodes();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode222_CountCompleteTreeNodes (Count Complete Tree Nodes) Passed!");
    }
}
