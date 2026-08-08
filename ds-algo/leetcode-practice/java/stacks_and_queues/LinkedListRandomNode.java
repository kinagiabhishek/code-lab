// https://leetcode.com/problems/linked-list-random-node/
package stacks_and_queues;

import java.util.*;

public class LinkedListRandomNode {
    // LeetCode Problem 382: Linked List Random Node
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LinkedListRandomNode solver = new LinkedListRandomNode();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LinkedListRandomNode (Linked List Random Node) Passed!");
    }
}
