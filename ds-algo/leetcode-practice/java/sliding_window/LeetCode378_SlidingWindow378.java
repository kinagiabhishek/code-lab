// https://leetcode.com/problems/sliding-window-range-378/
package sliding_window;

import java.util.*;

public class LeetCode378_SlidingWindow378 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode378_SlidingWindow378 solver = new LeetCode378_SlidingWindow378();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode378_SlidingWindow378 Passed!");
    }
}
