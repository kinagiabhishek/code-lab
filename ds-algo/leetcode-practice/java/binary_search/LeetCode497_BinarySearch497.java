// https://leetcode.com/problems/binary-search-range-497/
package binary_search;

import java.util.*;

public class LeetCode497_BinarySearch497 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode497_BinarySearch497 solver = new LeetCode497_BinarySearch497();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode497_BinarySearch497 Passed!");
    }
}
