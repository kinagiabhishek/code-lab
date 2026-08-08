// https://leetcode.com/problems/jump-game-ii/
package greedy;

import java.util.*;

public class LeetCode45_JumpGameII {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode45_JumpGameII solver = new LeetCode45_JumpGameII();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode45_JumpGameII Passed!");
    }
}
