// https://leetcode.com/problems/problem-slidingwindow-114/
package sliding_window;

import java.util.*;

public class LeetCode114_SlidingWindowProblem114 {
    public int solve(int[] nums, int k) {
        int sum = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= k) sum -= nums[i - k];
            if (i >= k - 1) max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        LeetCode114_SlidingWindowProblem114 solver = new LeetCode114_SlidingWindowProblem114();
        assert solver.solve(new int[]{2, 1, 5, 1, 3, 2}, 3) == 9;
        System.out.println("✅ LeetCode114_SlidingWindowProblem114 Passed!");
    }
}
