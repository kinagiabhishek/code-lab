// https://leetcode.com/problems/sliding-window-range-157/
package sliding_window;

import java.util.*;

public class LeetCode157_SlidingWindow157 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode157_SlidingWindow157 solver = new LeetCode157_SlidingWindow157();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode157_SlidingWindow157 Passed!");
    }
}
