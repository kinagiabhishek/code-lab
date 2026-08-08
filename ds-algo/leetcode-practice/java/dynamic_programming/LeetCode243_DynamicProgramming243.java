// https://leetcode.com/problems/dynamic-programming-memo-243/
package dynamic_programming;

import java.util.*;

public class LeetCode243_DynamicProgramming243 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode243_DynamicProgramming243 solver = new LeetCode243_DynamicProgramming243();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode243_DynamicProgramming243 Passed!");
    }
}
