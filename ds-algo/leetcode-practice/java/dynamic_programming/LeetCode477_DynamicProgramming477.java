// https://leetcode.com/problems/dynamic-programming-memo-477/
package dynamic_programming;

import java.util.*;

public class LeetCode477_DynamicProgramming477 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode477_DynamicProgramming477 solver = new LeetCode477_DynamicProgramming477();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode477_DynamicProgramming477 Passed!");
    }
}
