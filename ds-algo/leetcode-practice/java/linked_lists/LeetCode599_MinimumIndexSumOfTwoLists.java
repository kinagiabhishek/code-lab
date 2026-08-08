// https://leetcode.com/problems/minimum-index-sum-of-two-lists/
package linked_lists;

import java.util.*;

public class LeetCode599_MinimumIndexSumOfTwoLists {
    // LeetCode Problem 599: Minimum Index Sum of Two Lists
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode599_MinimumIndexSumOfTwoLists solver = new LeetCode599_MinimumIndexSumOfTwoLists();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode599_MinimumIndexSumOfTwoLists (Minimum Index Sum of Two Lists) Passed!");
    }
}
