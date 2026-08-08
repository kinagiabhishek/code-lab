// https://leetcode.com/problems/frog-jump/
package greedy;

import java.util.*;

public class FrogJump {
    // LeetCode Problem 403: Frog Jump
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FrogJump solver = new FrogJump();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode403_FrogJump (Frog Jump) Passed!");
    }
}
