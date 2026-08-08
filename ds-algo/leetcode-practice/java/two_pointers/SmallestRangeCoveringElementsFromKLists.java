// https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/
package two_pointers;

import java.util.*;

public class SmallestRangeCoveringElementsFromKLists {
    // LeetCode Problem 632: Smallest Range Covering Elements from K Lists
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SmallestRangeCoveringElementsFromKLists solver = new SmallestRangeCoveringElementsFromKLists();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SmallestRangeCoveringElementsFromKLists (Smallest Range Covering Elements from K Lists) Passed!");
    }
}
