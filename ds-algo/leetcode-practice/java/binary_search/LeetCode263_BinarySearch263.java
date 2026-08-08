// https://leetcode.com/problems/binary-search-range-263/
package binary_search;

import java.util.*;

public class LeetCode263_BinarySearch263 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode263_BinarySearch263 solver = new LeetCode263_BinarySearch263();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode263_BinarySearch263 Passed!");
    }
}
