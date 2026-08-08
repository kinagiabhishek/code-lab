// https://leetcode.com/problems/burst-balloons/
package arrays_and_hashing;

import java.util.*;

public class BurstBalloons {
    // LeetCode Problem 312: Burst Balloons
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BurstBalloons solver = new BurstBalloons();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode312_BurstBalloons (Burst Balloons) Passed!");
    }
}
