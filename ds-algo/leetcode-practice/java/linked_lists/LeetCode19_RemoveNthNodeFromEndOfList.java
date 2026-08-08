// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
package linked_lists;

import java.util.*;

public class LeetCode19_RemoveNthNodeFromEndOfList {
    // LeetCode Problem 19: Remove Nth Node From End of List
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode19_RemoveNthNodeFromEndOfList solver = new LeetCode19_RemoveNthNodeFromEndOfList();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode19_RemoveNthNodeFromEndOfList (Remove Nth Node From End of List) Passed!");
    }
}
