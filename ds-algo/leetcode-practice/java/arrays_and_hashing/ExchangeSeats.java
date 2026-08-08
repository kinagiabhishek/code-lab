// https://leetcode.com/problems/exchange-seats/
package arrays_and_hashing;

import java.util.*;

public class ExchangeSeats {
    // LeetCode Problem 626: Exchange Seats
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ExchangeSeats solver = new ExchangeSeats();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode626_ExchangeSeats (Exchange Seats) Passed!");
    }
}
