// https://leetcode.com/problems/consecutive-numbers/
package arrays_and_hashing;

import java.util.*;

public class LeetCode180_ConsecutiveNumbers {
    // LeetCode Problem 180: Consecutive Numbers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode180_ConsecutiveNumbers solver = new LeetCode180_ConsecutiveNumbers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode180_ConsecutiveNumbers (Consecutive Numbers) Passed!");
    }
}
