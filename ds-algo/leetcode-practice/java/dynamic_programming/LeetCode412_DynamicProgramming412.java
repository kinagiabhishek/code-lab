// https://leetcode.com/problems/dynamic-programming-memo-412/
package dynamic_programming;

import java.util.*;

public class LeetCode412_DynamicProgramming412 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode412_DynamicProgramming412 solver = new LeetCode412_DynamicProgramming412();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode412_DynamicProgramming412 Passed!");
    }
}
