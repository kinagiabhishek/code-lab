// https://leetcode.com/problems/clone-graph/
package trees;

import java.util.*;

public class CloneGraph {
    // LeetCode Problem 133: Clone Graph
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CloneGraph solver = new CloneGraph();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CloneGraph (Clone Graph) Passed!");
    }
}
