// https://leetcode.com/problems/sliding-window-range-508/
package sliding_window;

import java.util.*;

public class LeetCode508_SlidingWindow508 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode508_SlidingWindow508 solver = new LeetCode508_SlidingWindow508();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode508_SlidingWindow508 Passed!");
    }
}
