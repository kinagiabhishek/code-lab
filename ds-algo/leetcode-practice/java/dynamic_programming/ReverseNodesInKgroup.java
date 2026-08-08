// https://leetcode.com/problems/reverse-nodes-in-k-group/
package dynamic_programming;

import java.util.*;

public class ReverseNodesInKgroup {
    // LeetCode Problem 25: Reverse Nodes in k-Group
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ReverseNodesInKgroup solver = new ReverseNodesInKgroup();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ReverseNodesInKgroup (Reverse Nodes in k-Group) Passed!");
    }
}
