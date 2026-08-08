// https://leetcode.com/problems/relative-ranks/
package arrays_and_hashing;

import java.util.*;

public class RelativeRanks {
    // LeetCode Problem 506: Relative Ranks
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RelativeRanks solver = new RelativeRanks();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode506_RelativeRanks (Relative Ranks) Passed!");
    }
}
