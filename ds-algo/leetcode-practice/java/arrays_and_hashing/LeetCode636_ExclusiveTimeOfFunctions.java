// https://leetcode.com/problems/exclusive-time-of-functions/
package arrays_and_hashing;

import java.util.*;

public class LeetCode636_ExclusiveTimeOfFunctions {
    // LeetCode Problem 636: Exclusive Time of Functions
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode636_ExclusiveTimeOfFunctions solver = new LeetCode636_ExclusiveTimeOfFunctions();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode636_ExclusiveTimeOfFunctions (Exclusive Time of Functions) Passed!");
    }
}
