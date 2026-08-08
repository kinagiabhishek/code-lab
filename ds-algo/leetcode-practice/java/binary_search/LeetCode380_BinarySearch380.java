// https://leetcode.com/problems/binary-search-range-380/
package binary_search;

import java.util.*;

public class LeetCode380_BinarySearch380 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode380_BinarySearch380 solver = new LeetCode380_BinarySearch380();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode380_BinarySearch380 Passed!");
    }
}
