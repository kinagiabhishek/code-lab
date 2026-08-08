// https://leetcode.com/problems/dynamic-programming-memo-438/
package dynamic_programming;

import java.util.*;

public class LeetCode438_DynamicProgramming438 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode438_DynamicProgramming438 solver = new LeetCode438_DynamicProgramming438();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode438_DynamicProgramming438 Passed!");
    }
}
