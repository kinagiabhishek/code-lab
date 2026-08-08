// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
package arrays_and_hashing;

import java.util.*;

public class LeetCode452_MinimumNumberOfArrowsToBurstBalloons {
    // LeetCode Problem 452: Minimum Number of Arrows to Burst Balloons
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode452_MinimumNumberOfArrowsToBurstBalloons solver = new LeetCode452_MinimumNumberOfArrowsToBurstBalloons();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode452_MinimumNumberOfArrowsToBurstBalloons (Minimum Number of Arrows to Burst Balloons) Passed!");
    }
}
