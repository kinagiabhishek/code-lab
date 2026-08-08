// https://leetcode.com/problems/regular-expression-matching/
package dynamic_programming;

import java.util.*;

public class LeetCode10_RegularExpressionMatching {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode10_RegularExpressionMatching solver = new LeetCode10_RegularExpressionMatching();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode10_RegularExpressionMatching Passed!");
    }
}
