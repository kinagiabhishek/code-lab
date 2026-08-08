// https://leetcode.com/problems/dynamic-programming-memo-74/
package dynamic_programming;

import java.util.*;

public class LeetCode74_DynamicProgramming74 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode74_DynamicProgramming74 solver = new LeetCode74_DynamicProgramming74();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode74_DynamicProgramming74 Passed!");
    }
}
