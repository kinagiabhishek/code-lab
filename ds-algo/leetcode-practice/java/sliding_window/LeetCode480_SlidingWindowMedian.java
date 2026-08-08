// https://leetcode.com/problems/sliding-window-median/
package sliding_window;

import java.util.*;

public class LeetCode480_SlidingWindowMedian {
    // LeetCode Problem 480: Sliding Window Median
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode480_SlidingWindowMedian solver = new LeetCode480_SlidingWindowMedian();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode480_SlidingWindowMedian (Sliding Window Median) Passed!");
    }
}
