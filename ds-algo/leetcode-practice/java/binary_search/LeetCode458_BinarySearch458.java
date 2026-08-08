// https://leetcode.com/problems/binary-search-range-458/
package binary_search;

import java.util.*;

public class LeetCode458_BinarySearch458 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode458_BinarySearch458 solver = new LeetCode458_BinarySearch458();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode458_BinarySearch458 Passed!");
    }
}
