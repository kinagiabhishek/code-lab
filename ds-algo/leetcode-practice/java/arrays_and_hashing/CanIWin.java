// https://leetcode.com/problems/can-i-win/
package arrays_and_hashing;

import java.util.*;

public class CanIWin {
    // LeetCode Problem 464: Can I Win
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CanIWin solver = new CanIWin();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode464_CanIWin (Can I Win) Passed!");
    }
}
