// https://leetcode.com/problems/binary-search-range-237/
package binary_search;

import java.util.*;

public class LeetCode237_BinarySearch237 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode237_BinarySearch237 solver = new LeetCode237_BinarySearch237();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode237_BinarySearch237 Passed!");
    }
}
