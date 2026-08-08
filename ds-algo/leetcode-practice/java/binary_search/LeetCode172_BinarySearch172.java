// https://leetcode.com/problems/binary-search-range-172/
package binary_search;

import java.util.*;

public class LeetCode172_BinarySearch172 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode172_BinarySearch172 solver = new LeetCode172_BinarySearch172();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode172_BinarySearch172 Passed!");
    }
}
