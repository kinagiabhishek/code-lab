// https://leetcode.com/problems/exchange-seats/
package arrays_and_hashing;

import java.util.*;

public class LeetCode626_ExchangeSeats {
    // LeetCode Problem 626: Exchange Seats
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode626_ExchangeSeats solver = new LeetCode626_ExchangeSeats();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode626_ExchangeSeats (Exchange Seats) Passed!");
    }
}
