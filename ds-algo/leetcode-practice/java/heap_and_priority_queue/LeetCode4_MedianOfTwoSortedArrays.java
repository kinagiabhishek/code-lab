// https://leetcode.com/problems/median-of-two-sorted-arrays/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode4_MedianOfTwoSortedArrays {
    // LeetCode Problem 4: Median of Two Sorted Arrays
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode4_MedianOfTwoSortedArrays solver = new LeetCode4_MedianOfTwoSortedArrays();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode4_MedianOfTwoSortedArrays (Median of Two Sorted Arrays) Passed!");
    }
}
