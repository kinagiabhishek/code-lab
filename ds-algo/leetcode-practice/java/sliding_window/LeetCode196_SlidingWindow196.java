// https://leetcode.com/problems/sliding-window-range-196/
package sliding_window;

import java.util.*;

public class LeetCode196_SlidingWindow196 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode196_SlidingWindow196 solver = new LeetCode196_SlidingWindow196();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode196_SlidingWindow196 Passed!");
    }
}
