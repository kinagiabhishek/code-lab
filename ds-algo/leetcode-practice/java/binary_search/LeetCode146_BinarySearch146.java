// https://leetcode.com/problems/binary-search-range-146/
package binary_search;

import java.util.*;

public class LeetCode146_BinarySearch146 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode146_BinarySearch146 solver = new LeetCode146_BinarySearch146();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode146_BinarySearch146 Passed!");
    }
}
