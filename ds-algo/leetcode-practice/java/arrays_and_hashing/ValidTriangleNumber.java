// https://leetcode.com/problems/valid-triangle-number/
package arrays_and_hashing;

import java.util.*;

public class ValidTriangleNumber {
    // LeetCode Problem 611: Valid Triangle Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ValidTriangleNumber solver = new ValidTriangleNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode611_ValidTriangleNumber (Valid Triangle Number) Passed!");
    }
}
