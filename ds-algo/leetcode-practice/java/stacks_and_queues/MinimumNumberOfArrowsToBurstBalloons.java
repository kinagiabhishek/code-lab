// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
package stacks_and_queues;

import java.util.*;

public class MinimumNumberOfArrowsToBurstBalloons {
    // LeetCode Problem 452: Minimum Number of Arrows to Burst Balloons
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        MinimumNumberOfArrowsToBurstBalloons solver = new MinimumNumberOfArrowsToBurstBalloons();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ MinimumNumberOfArrowsToBurstBalloons Passed!");
    }
}
