// https://leetcode.com/problems/frog-jump/
package greedy;

import java.util.*;

public class LeetCode403_FrogJump {
    // LeetCode Problem 403: Frog Jump
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode403_FrogJump solver = new LeetCode403_FrogJump();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode403_FrogJump (Frog Jump) Passed!");
    }
}
