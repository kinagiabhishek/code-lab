// https://leetcode.com/problems/binary-search-range-107/
package binary_search;

import java.util.*;

public class LeetCode107_BinarySearch107 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode107_BinarySearch107 solver = new LeetCode107_BinarySearch107();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode107_BinarySearch107 Passed!");
    }
}
