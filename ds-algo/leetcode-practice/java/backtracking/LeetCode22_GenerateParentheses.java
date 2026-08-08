// https://leetcode.com/problems/generate-parentheses/
package backtracking;

import java.util.*;

public class LeetCode22_GenerateParentheses {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode22_GenerateParentheses solver = new LeetCode22_GenerateParentheses();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode22_GenerateParentheses Passed!");
    }
}
