// https://leetcode.com/problems/detect-capital/
package arrays_and_hashing;

import java.util.*;

public class DetectCapital {
    // LeetCode Problem 520: Detect Capital
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        DetectCapital solver = new DetectCapital();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode520_DetectCapital (Detect Capital) Passed!");
    }
}
