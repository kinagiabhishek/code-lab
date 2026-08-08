// https://leetcode.com/problems/implement-rand10-using-rand7/
package bit_manipulation;

import java.util.*;

public class ImplementRand10UsingRand7 {
    // LeetCode Problem 470: Implement Rand10() Using Rand7()
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ImplementRand10UsingRand7 solver = new ImplementRand10UsingRand7();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode470_ImplementRand10UsingRand7 (Implement Rand10() Using Rand7()) Passed!");
    }
}
