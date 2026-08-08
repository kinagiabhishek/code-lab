// https://leetcode.com/problems/two-pointer-pair-156/
package two_pointers;

import java.util.*;

public class LeetCode156_TwoPointers156 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode156_TwoPointers156 solver = new LeetCode156_TwoPointers156();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode156_TwoPointers156 Passed!");
    }
}
