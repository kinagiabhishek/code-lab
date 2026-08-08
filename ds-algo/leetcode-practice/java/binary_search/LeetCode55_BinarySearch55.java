// https://leetcode.com/problems/binary-search-range-55/
package binary_search;

import java.util.*;

public class LeetCode55_BinarySearch55 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode55_BinarySearch55 solver = new LeetCode55_BinarySearch55();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode55_BinarySearch55 Passed!");
    }
}
