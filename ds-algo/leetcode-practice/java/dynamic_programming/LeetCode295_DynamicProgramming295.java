// https://leetcode.com/problems/dynamic-programming-memo-295/
package dynamic_programming;

import java.util.*;

public class LeetCode295_DynamicProgramming295 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode295_DynamicProgramming295 solver = new LeetCode295_DynamicProgramming295();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode295_DynamicProgramming295 Passed!");
    }
}
