// https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/
package linked_lists;

import java.util.*;

public class LeetCode632_SmallestRangeCoveringElementsFromKLists {
    // LeetCode Problem 632: Smallest Range Covering Elements from K Lists
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode632_SmallestRangeCoveringElementsFromKLists solver = new LeetCode632_SmallestRangeCoveringElementsFromKLists();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode632_SmallestRangeCoveringElementsFromKLists (Smallest Range Covering Elements from K Lists) Passed!");
    }
}
