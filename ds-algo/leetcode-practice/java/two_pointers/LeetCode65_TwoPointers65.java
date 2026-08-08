// https://leetcode.com/problems/two-pointer-pair-65/
package two_pointers;

import java.util.*;

public class LeetCode65_TwoPointers65 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode65_TwoPointers65 solver = new LeetCode65_TwoPointers65();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode65_TwoPointers65 Passed!");
    }
}
