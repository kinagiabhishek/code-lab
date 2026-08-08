// https://leetcode.com/problems/binary-search-range-120/
package binary_search;

import java.util.*;

public class LeetCode120_BinarySearch120 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode120_BinarySearch120 solver = new LeetCode120_BinarySearch120();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode120_BinarySearch120 Passed!");
    }
}
