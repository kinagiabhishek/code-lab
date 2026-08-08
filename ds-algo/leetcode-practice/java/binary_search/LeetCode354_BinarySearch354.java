// https://leetcode.com/problems/binary-search-range-354/
package binary_search;

import java.util.*;

public class LeetCode354_BinarySearch354 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode354_BinarySearch354 solver = new LeetCode354_BinarySearch354();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode354_BinarySearch354 Passed!");
    }
}
