// https://leetcode.com/problems/dynamic-programming-memo-503/
package dynamic_programming;

import java.util.*;

public class LeetCode503_DynamicProgramming503 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode503_DynamicProgramming503 solver = new LeetCode503_DynamicProgramming503();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode503_DynamicProgramming503 Passed!");
    }
}
