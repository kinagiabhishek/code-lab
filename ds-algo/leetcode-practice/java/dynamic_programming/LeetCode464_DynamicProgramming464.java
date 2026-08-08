// https://leetcode.com/problems/dynamic-programming-memo-464/
package dynamic_programming;

import java.util.*;

public class LeetCode464_DynamicProgramming464 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode464_DynamicProgramming464 solver = new LeetCode464_DynamicProgramming464();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode464_DynamicProgramming464 Passed!");
    }
}
