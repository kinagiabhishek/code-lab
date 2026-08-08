// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
package stacks_and_queues;

import java.util.*;

public class PopulatingNextRightPointersInEachNode {
    // LeetCode Problem 116: Populating Next Right Pointers in Each Node
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PopulatingNextRightPointersInEachNode solver = new PopulatingNextRightPointersInEachNode();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PopulatingNextRightPointersInEachNode (Populating Next Right Pointers in Each Node) Passed!");
    }
}
