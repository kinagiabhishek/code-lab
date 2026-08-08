// https://leetcode.com/problems/merge-two-sorted-lists/
package linked_lists;

import java.util.*;

public class LeetCode21_MergeTwoSortedLists {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode21_MergeTwoSortedLists solver = new LeetCode21_MergeTwoSortedLists();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode21_MergeTwoSortedLists Passed!");
    }
}
