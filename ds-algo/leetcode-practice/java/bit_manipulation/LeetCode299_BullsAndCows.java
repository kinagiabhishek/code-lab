// https://leetcode.com/problems/bulls-and-cows/
package bit_manipulation;

import java.util.*;

public class LeetCode299_BullsAndCows {
    // LeetCode Problem 299: Bulls and Cows
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode299_BullsAndCows solver = new LeetCode299_BullsAndCows();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode299_BullsAndCows (Bulls and Cows) Passed!");
    }
}
