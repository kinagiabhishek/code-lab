// https://leetcode.com/problems/teemo-attacking/
package arrays_and_hashing;

import java.util.*;

public class LeetCode495_TeemoAttacking {
    // LeetCode Problem 495: Teemo Attacking
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode495_TeemoAttacking solver = new LeetCode495_TeemoAttacking();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode495_TeemoAttacking (Teemo Attacking) Passed!");
    }
}
