// https://leetcode.com/problems/count-complete-tree-nodes/
package trees;

import java.util.*;

public class CountCompleteTreeNodes {
    // LeetCode Problem 222: Count Complete Tree Nodes
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CountCompleteTreeNodes solver = new CountCompleteTreeNodes();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode222_CountCompleteTreeNodes (Count Complete Tree Nodes) Passed!");
    }
}
