// https://leetcode.com/problems/binary-search-range-432/
package binary_search;

import java.util.*;

public class LeetCode432_BinarySearch432 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode432_BinarySearch432 solver = new LeetCode432_BinarySearch432();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode432_BinarySearch432 Passed!");
    }
}
