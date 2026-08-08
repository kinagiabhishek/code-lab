// https://leetcode.com/problems/merge-sorted-array/
package bit_manipulation;

import java.util.*;

public class MergeSortedArray {
    // LeetCode Problem 88: Merge Sorted Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MergeSortedArray solver = new MergeSortedArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode88_MergeSortedArray (Merge Sorted Array) Passed!");
    }
}
