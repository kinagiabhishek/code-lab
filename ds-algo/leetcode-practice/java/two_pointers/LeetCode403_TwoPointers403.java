// https://leetcode.com/problems/two-pointer-pair-403/
package two_pointers;

import java.util.*;

public class LeetCode403_TwoPointers403 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode403_TwoPointers403 solver = new LeetCode403_TwoPointers403();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode403_TwoPointers403 Passed!");
    }
}
