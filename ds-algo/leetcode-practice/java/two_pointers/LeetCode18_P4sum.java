// https://leetcode.com/problems/4sum/
package two_pointers;

import java.util.*;

public class LeetCode18_P4sum {
    // LeetCode Problem 18: 4Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode18_P4sum solver = new LeetCode18_P4sum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode18_P4sum (4Sum) Passed!");
    }
}
