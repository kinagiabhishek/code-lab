// https://leetcode.com/problems/dynamic-programming-memo-334/
package dynamic_programming;

import java.util.*;

public class LeetCode334_DynamicProgramming334 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode334_DynamicProgramming334 solver = new LeetCode334_DynamicProgramming334();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode334_DynamicProgramming334 Passed!");
    }
}
