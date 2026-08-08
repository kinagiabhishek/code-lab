// https://leetcode.com/problems/two-pointer-pair-481/
package two_pointers;

import java.util.*;

public class LeetCode481_TwoPointers481 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode481_TwoPointers481 solver = new LeetCode481_TwoPointers481();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode481_TwoPointers481 Passed!");
    }
}
