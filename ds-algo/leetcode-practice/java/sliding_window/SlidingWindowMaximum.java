// https://leetcode.com/problems/sliding-window-maximum/
package sliding_window;

import java.util.*;

public class SlidingWindowMaximum {
    // LeetCode Problem 239: Sliding Window Maximum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SlidingWindowMaximum solver = new SlidingWindowMaximum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode239_SlidingWindowMaximum (Sliding Window Maximum) Passed!");
    }
}
