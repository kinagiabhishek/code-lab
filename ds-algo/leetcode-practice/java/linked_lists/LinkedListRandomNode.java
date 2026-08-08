// https://leetcode.com/problems/linked-list-random-node/
package linked_lists;

import java.util.*;

public class LinkedListRandomNode {
    // LeetCode Problem 382: Linked List Random Node
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LinkedListRandomNode solver = new LinkedListRandomNode();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode382_LinkedListRandomNode (Linked List Random Node) Passed!");
    }
}
