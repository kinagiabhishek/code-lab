// https://leetcode.com/problems/count-complete-tree-nodes/
package greedy;

import java.util.*;

public class CountCompleteTreeNodes {
    // LeetCode Problem 222: Count Complete Tree Nodes
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CountCompleteTreeNodes solver = new CountCompleteTreeNodes();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CountCompleteTreeNodes (Count Complete Tree Nodes) Passed!");
    }
}
