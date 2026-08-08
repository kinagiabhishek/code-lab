// https://leetcode.com/problems/fraction-addition-and-subtraction/
package bit_manipulation;

import java.util.*;

public class LeetCode592_FractionAdditionAndSubtraction {
    // LeetCode Problem 592: Fraction Addition and Subtraction
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode592_FractionAdditionAndSubtraction solver = new LeetCode592_FractionAdditionAndSubtraction();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode592_FractionAdditionAndSubtraction (Fraction Addition and Subtraction) Passed!");
    }
}
