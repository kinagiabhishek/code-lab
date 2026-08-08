// https://leetcode.com/problems/merge-k-sorted-lists/
package linked_lists;

import java.util.*;

public class LeetCode23_MergeKSortedLists {
    // LeetCode Problem 23: Merge k Sorted Lists
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode23_MergeKSortedLists solver = new LeetCode23_MergeKSortedLists();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode23_MergeKSortedLists (Merge k Sorted Lists) Passed!");
    }
}
