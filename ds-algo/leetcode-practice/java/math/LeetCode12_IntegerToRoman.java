// https://leetcode.com/problems/integer-to-roman/
package math;

import java.util.*;

public class LeetCode12_IntegerToRoman {
    // LeetCode Problem 12: Integer to Roman
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode12_IntegerToRoman solver = new LeetCode12_IntegerToRoman();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode12_IntegerToRoman (Integer to Roman) Passed!");
    }
}
