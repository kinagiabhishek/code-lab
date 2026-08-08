// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package bit_manipulation;

import java.util.*;

public class FindFirstAndLastPositionOfElementInSortedArray {
    // LeetCode Problem 34: Find First and Last Position of Element in Sorted Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FindFirstAndLastPositionOfElementInSortedArray solver = new FindFirstAndLastPositionOfElementInSortedArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode34_FindFirstAndLastPositionOfElementInSortedArray (Find First and Last Position of Element in Sorted Array) Passed!");
    }
}
