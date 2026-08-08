// https://leetcode.com/problems/binary-search-range-159/
package binary_search;

import java.util.*;

public class LeetCode159_BinarySearch159 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode159_BinarySearch159 solver = new LeetCode159_BinarySearch159();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode159_BinarySearch159 Passed!");
    }
}
