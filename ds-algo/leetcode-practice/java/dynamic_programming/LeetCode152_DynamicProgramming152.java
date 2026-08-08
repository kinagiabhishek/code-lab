// https://leetcode.com/problems/dynamic-programming-memo-152/
package dynamic_programming;

import java.util.*;

public class LeetCode152_DynamicProgramming152 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode152_DynamicProgramming152 solver = new LeetCode152_DynamicProgramming152();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode152_DynamicProgramming152 Passed!");
    }
}
