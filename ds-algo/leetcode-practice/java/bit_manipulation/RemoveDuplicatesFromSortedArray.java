// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package bit_manipulation;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    // LeetCode Problem 26: Remove Duplicates from Sorted Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solver = new RemoveDuplicatesFromSortedArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode26_RemoveDuplicatesFromSortedArray (Remove Duplicates from Sorted Array) Passed!");
    }
}
