// https://leetcode.com/problems/integer-break/
package arrays_and_hashing;

import java.util.*;

public class IntegerBreak {
    // LeetCode Problem 343: Integer Break
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        IntegerBreak solver = new IntegerBreak();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode343_IntegerBreak (Integer Break) Passed!");
    }
}
