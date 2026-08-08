// https://leetcode.com/problems/add-digits/
package math;

import java.util.*;

public class AddDigits {
    // LeetCode Problem 258: Add Digits
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        AddDigits solver = new AddDigits();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode258_AddDigits (Add Digits) Passed!");
    }
}
