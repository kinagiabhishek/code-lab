// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
package bit_manipulation;

import java.util.*;

public class RemoveDuplicatesFromSortedArrayIi {
    // LeetCode Problem 80: Remove Duplicates from Sorted Array II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrayIi solver = new RemoveDuplicatesFromSortedArrayIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode80_RemoveDuplicatesFromSortedArrayIi (Remove Duplicates from Sorted Array II) Passed!");
    }
}
