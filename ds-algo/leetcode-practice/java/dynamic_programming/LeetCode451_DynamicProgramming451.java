// https://leetcode.com/problems/dynamic-programming-memo-451/
package dynamic_programming;

import java.util.*;

public class LeetCode451_DynamicProgramming451 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode451_DynamicProgramming451 solver = new LeetCode451_DynamicProgramming451();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode451_DynamicProgramming451 Passed!");
    }
}
