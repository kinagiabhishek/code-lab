// https://leetcode.com/problems/binary-search-range-250/
package binary_search;

import java.util.*;

public class LeetCode250_BinarySearch250 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode250_BinarySearch250 solver = new LeetCode250_BinarySearch250();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode250_BinarySearch250 Passed!");
    }
}
