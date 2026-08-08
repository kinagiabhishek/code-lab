// https://leetcode.com/problems/dynamic-programming-memo-165/
package dynamic_programming;

import java.util.*;

public class LeetCode165_DynamicProgramming165 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode165_DynamicProgramming165 solver = new LeetCode165_DynamicProgramming165();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode165_DynamicProgramming165 Passed!");
    }
}
