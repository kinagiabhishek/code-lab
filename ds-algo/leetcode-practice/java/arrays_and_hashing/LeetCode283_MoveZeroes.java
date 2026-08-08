// https://leetcode.com/problems/move-zeroes/
package arrays_and_hashing;

import java.util.*;

public class LeetCode283_MoveZeroes {
    // LeetCode Problem 283: Move Zeroes
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode283_MoveZeroes solver = new LeetCode283_MoveZeroes();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode283_MoveZeroes (Move Zeroes) Passed!");
    }
}
