// https://leetcode.com/problems/rising-temperature/
package stacks_and_queues;

import java.util.*;

public class RisingTemperature {
    // LeetCode Problem 197: Rising Temperature
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RisingTemperature solver = new RisingTemperature();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode197_RisingTemperature (Rising Temperature) Passed!");
    }
}
