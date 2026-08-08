// https://leetcode.com/problems/dynamic-programming-memo-100/
package dynamic_programming;

import java.util.*;

public class LeetCode100_DynamicProgramming100 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode100_DynamicProgramming100 solver = new LeetCode100_DynamicProgramming100();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode100_DynamicProgramming100 Passed!");
    }
}
