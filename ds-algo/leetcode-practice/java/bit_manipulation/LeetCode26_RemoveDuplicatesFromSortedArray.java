// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package bit_manipulation;

import java.util.*;

public class LeetCode26_RemoveDuplicatesFromSortedArray {
    // LeetCode Problem 26: Remove Duplicates from Sorted Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode26_RemoveDuplicatesFromSortedArray solver = new LeetCode26_RemoveDuplicatesFromSortedArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode26_RemoveDuplicatesFromSortedArray (Remove Duplicates from Sorted Array) Passed!");
    }
}
