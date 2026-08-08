// https://leetcode.com/problems/dynamic-programming-memo-178/
package dynamic_programming;

import java.util.*;

public class LeetCode178_DynamicProgramming178 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode178_DynamicProgramming178 solver = new LeetCode178_DynamicProgramming178();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode178_DynamicProgramming178 Passed!");
    }
}
