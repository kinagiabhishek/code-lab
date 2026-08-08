// https://leetcode.com/problems/binary-search-range-471/
package binary_search;

import java.util.*;

public class LeetCode471_BinarySearch471 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode471_BinarySearch471 solver = new LeetCode471_BinarySearch471();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode471_BinarySearch471 Passed!");
    }
}
