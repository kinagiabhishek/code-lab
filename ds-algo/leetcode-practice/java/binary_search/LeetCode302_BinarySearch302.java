// https://leetcode.com/problems/binary-search-range-302/
package binary_search;

import java.util.*;

public class LeetCode302_BinarySearch302 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode302_BinarySearch302 solver = new LeetCode302_BinarySearch302();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode302_BinarySearch302 Passed!");
    }
}
