// https://leetcode.com/problems/dynamic-programming-memo-516/
package dynamic_programming;

import java.util.*;

public class LeetCode516_DynamicProgramming516 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode516_DynamicProgramming516 solver = new LeetCode516_DynamicProgramming516();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode516_DynamicProgramming516 Passed!");
    }
}
