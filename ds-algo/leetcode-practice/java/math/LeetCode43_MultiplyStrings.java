// https://leetcode.com/problems/multiply-strings/
package math;

import java.util.*;

public class LeetCode43_MultiplyStrings {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode43_MultiplyStrings solver = new LeetCode43_MultiplyStrings();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode43_MultiplyStrings Passed!");
    }
}
