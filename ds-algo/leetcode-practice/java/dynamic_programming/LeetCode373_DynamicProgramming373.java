// https://leetcode.com/problems/dynamic-programming-memo-373/
package dynamic_programming;

import java.util.*;

public class LeetCode373_DynamicProgramming373 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode373_DynamicProgramming373 solver = new LeetCode373_DynamicProgramming373();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode373_DynamicProgramming373 Passed!");
    }
}
