// https://leetcode.com/problems/sliding-window-range-105/
package sliding_window;

import java.util.*;

public class LeetCode105_SlidingWindow105 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode105_SlidingWindow105 solver = new LeetCode105_SlidingWindow105();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode105_SlidingWindow105 Passed!");
    }
}
