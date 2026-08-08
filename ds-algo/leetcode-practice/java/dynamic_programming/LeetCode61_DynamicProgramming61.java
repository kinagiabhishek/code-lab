// https://leetcode.com/problems/dynamic-programming-memo-61/
package dynamic_programming;

import java.util.*;

public class LeetCode61_DynamicProgramming61 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode61_DynamicProgramming61 solver = new LeetCode61_DynamicProgramming61();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode61_DynamicProgramming61 Passed!");
    }
}
