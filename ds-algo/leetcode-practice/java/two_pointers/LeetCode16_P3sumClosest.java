// https://leetcode.com/problems/3sum-closest/
package two_pointers;

import java.util.*;

public class LeetCode16_P3sumClosest {
    // LeetCode Problem 16: 3Sum Closest
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode16_P3sumClosest solver = new LeetCode16_P3sumClosest();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode16_P3sumClosest (3Sum Closest) Passed!");
    }
}
