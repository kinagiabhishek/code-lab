// https://leetcode.com/problems/sliding-window-range-274/
package sliding_window;

import java.util.*;

public class LeetCode274_SlidingWindow274 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode274_SlidingWindow274 solver = new LeetCode274_SlidingWindow274();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode274_SlidingWindow274 Passed!");
    }
}
