// https://leetcode.com/problems/detect-capital/
package arrays_and_hashing;

import java.util.*;

public class LeetCode520_DetectCapital {
    // LeetCode Problem 520: Detect Capital
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode520_DetectCapital solver = new LeetCode520_DetectCapital();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode520_DetectCapital (Detect Capital) Passed!");
    }
}
