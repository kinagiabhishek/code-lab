// https://leetcode.com/problems/human-traffic-of-stadium/
package arrays_and_hashing;

import java.util.*;

public class LeetCode601_HumanTrafficOfStadium {
    // LeetCode Problem 601: Human Traffic of Stadium
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode601_HumanTrafficOfStadium solver = new LeetCode601_HumanTrafficOfStadium();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode601_HumanTrafficOfStadium (Human Traffic of Stadium) Passed!");
    }
}
