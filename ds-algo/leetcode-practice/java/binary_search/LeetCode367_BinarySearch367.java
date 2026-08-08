// https://leetcode.com/problems/binary-search-range-367/
package binary_search;

import java.util.*;

public class LeetCode367_BinarySearch367 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode367_BinarySearch367 solver = new LeetCode367_BinarySearch367();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode367_BinarySearch367 Passed!");
    }
}
