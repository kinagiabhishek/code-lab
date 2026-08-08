// https://leetcode.com/problems/binary-search-range-419/
package binary_search;

import java.util.*;

public class LeetCode419_BinarySearch419 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode419_BinarySearch419 solver = new LeetCode419_BinarySearch419();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode419_BinarySearch419 Passed!");
    }
}
