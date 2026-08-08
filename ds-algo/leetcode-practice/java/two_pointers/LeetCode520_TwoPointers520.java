// https://leetcode.com/problems/two-pointer-pair-520/
package two_pointers;

import java.util.*;

public class LeetCode520_TwoPointers520 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode520_TwoPointers520 solver = new LeetCode520_TwoPointers520();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode520_TwoPointers520 Passed!");
    }
}
