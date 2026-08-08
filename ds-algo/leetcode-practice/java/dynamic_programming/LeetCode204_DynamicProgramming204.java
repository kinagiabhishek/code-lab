// https://leetcode.com/problems/dynamic-programming-memo-204/
package dynamic_programming;

import java.util.*;

public class LeetCode204_DynamicProgramming204 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode204_DynamicProgramming204 solver = new LeetCode204_DynamicProgramming204();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode204_DynamicProgramming204 Passed!");
    }
}
