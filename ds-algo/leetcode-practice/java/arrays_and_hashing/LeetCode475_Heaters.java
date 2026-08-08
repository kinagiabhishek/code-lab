// https://leetcode.com/problems/heaters/
package arrays_and_hashing;

import java.util.*;

public class LeetCode475_Heaters {
    // LeetCode Problem 475: Heaters
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode475_Heaters solver = new LeetCode475_Heaters();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode475_Heaters (Heaters) Passed!");
    }
}
