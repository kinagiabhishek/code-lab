// https://leetcode.com/problems/dynamic-programming-memo-191/
package dynamic_programming;

import java.util.*;

public class LeetCode191_DynamicProgramming191 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode191_DynamicProgramming191 solver = new LeetCode191_DynamicProgramming191();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode191_DynamicProgramming191 Passed!");
    }
}
