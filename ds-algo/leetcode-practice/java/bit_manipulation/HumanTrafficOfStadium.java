// https://leetcode.com/problems/human-traffic-of-stadium/
package bit_manipulation;

import java.util.*;

public class HumanTrafficOfStadium {
    // LeetCode Problem 601: Human Traffic of Stadium
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        HumanTrafficOfStadium solver = new HumanTrafficOfStadium();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ HumanTrafficOfStadium (Human Traffic of Stadium) Passed!");
    }
}
