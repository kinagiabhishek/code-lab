// https://leetcode.com/problems/sliding-window-range-404/
package sliding_window;

import java.util.*;

public class LeetCode404_SlidingWindow404 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode404_SlidingWindow404 solver = new LeetCode404_SlidingWindow404();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode404_SlidingWindow404 Passed!");
    }
}
