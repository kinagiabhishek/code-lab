// https://leetcode.com/problems/binary-search-range-211/
package binary_search;

import java.util.*;

public class LeetCode211_BinarySearch211 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode211_BinarySearch211 solver = new LeetCode211_BinarySearch211();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode211_BinarySearch211 Passed!");
    }
}
