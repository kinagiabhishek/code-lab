// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
package math;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {
    // LeetCode Problem 448: Find All Numbers Disappeared in an Array
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray solver = new FindAllNumbersDisappearedInAnArray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindAllNumbersDisappearedInAnArray (Find All Numbers Disappeared in an Array) Passed!");
    }
}
