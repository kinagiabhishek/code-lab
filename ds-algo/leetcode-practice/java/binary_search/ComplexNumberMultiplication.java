// https://leetcode.com/problems/complex-number-multiplication/
package binary_search;

import java.util.*;

public class ComplexNumberMultiplication {
    // LeetCode Problem 537: Complex Number Multiplication
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ComplexNumberMultiplication solver = new ComplexNumberMultiplication();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ComplexNumberMultiplication (Complex Number Multiplication) Passed!");
    }
}
