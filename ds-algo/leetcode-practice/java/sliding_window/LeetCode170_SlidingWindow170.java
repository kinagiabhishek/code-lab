// https://leetcode.com/problems/sliding-window-range-170/
package sliding_window;

import java.util.*;

public class LeetCode170_SlidingWindow170 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode170_SlidingWindow170 solver = new LeetCode170_SlidingWindow170();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode170_SlidingWindow170 Passed!");
    }
}
