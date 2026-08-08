// https://leetcode.com/problems/two-pointer-pair-247/
package two_pointers;

import java.util.*;

public class LeetCode247_TwoPointers247 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode247_TwoPointers247 solver = new LeetCode247_TwoPointers247();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode247_TwoPointers247 Passed!");
    }
}
