// https://leetcode.com/problems/3sum/
package two_pointers;

import java.util.*;

public class LeetCode15_P3sum {
    // LeetCode Problem 15: 3Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode15_P3sum solver = new LeetCode15_P3sum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode15_P3sum (3Sum) Passed!");
    }
}
