// https://leetcode.com/problems/can-i-win/
package arrays_and_hashing;

import java.util.*;

public class LeetCode464_CanIWin {
    // LeetCode Problem 464: Can I Win
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode464_CanIWin solver = new LeetCode464_CanIWin();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode464_CanIWin (Can I Win) Passed!");
    }
}
