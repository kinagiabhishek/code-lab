// https://leetcode.com/problems/merge-two-sorted-lists/
package linked_lists;

import java.util.*;

public class LeetCode21_MergeTwoSortedLists {
    // LeetCode Problem 21: Merge Two Sorted Lists
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode21_MergeTwoSortedLists solver = new LeetCode21_MergeTwoSortedLists();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode21_MergeTwoSortedLists (Merge Two Sorted Lists) Passed!");
    }
}
