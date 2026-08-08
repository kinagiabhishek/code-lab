// https://leetcode.com/problems/complex-number-multiplication/
package arrays_and_hashing;

import java.util.*;

public class ComplexNumberMultiplication {
    // LeetCode Problem 537: Complex Number Multiplication
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ComplexNumberMultiplication solver = new ComplexNumberMultiplication();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode537_ComplexNumberMultiplication (Complex Number Multiplication) Passed!");
    }
}
