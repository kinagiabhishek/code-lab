// https://leetcode.com/problems/dynamic-programming-memo-87/
package dynamic_programming;

import java.util.*;

public class LeetCode87_DynamicProgramming87 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode87_DynamicProgramming87 solver = new LeetCode87_DynamicProgramming87();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode87_DynamicProgramming87 Passed!");
    }
}
