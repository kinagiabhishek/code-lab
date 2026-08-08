// https://leetcode.com/problems/binary-search-range-276/
package binary_search;

import java.util.*;

public class LeetCode276_BinarySearch276 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode276_BinarySearch276 solver = new LeetCode276_BinarySearch276();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode276_BinarySearch276 Passed!");
    }
}
