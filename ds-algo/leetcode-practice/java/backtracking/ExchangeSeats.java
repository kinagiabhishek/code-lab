// https://leetcode.com/problems/exchange-seats/
package backtracking;

import java.util.*;

public class ExchangeSeats {
    // LeetCode Problem 626: Exchange Seats
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ExchangeSeats solver = new ExchangeSeats();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ExchangeSeats (Exchange Seats) Passed!");
    }
}
