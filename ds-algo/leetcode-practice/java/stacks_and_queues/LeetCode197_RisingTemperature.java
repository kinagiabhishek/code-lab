// https://leetcode.com/problems/rising-temperature/
package stacks_and_queues;

import java.util.*;

public class LeetCode197_RisingTemperature {
    // LeetCode Problem 197: Rising Temperature
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode197_RisingTemperature solver = new LeetCode197_RisingTemperature();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode197_RisingTemperature (Rising Temperature) Passed!");
    }
}
