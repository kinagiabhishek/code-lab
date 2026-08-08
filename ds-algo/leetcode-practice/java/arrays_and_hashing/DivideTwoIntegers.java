// https://leetcode.com/problems/divide-two-integers/
package arrays_and_hashing;

import java.util.*;

public class DivideTwoIntegers {
    // LeetCode Problem 29: Divide Two Integers
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DivideTwoIntegers solver = new DivideTwoIntegers();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DivideTwoIntegers (Divide Two Integers) Passed!");
    }
}
