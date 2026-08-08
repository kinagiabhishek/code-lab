// https://leetcode.com/problems/binary-search-range-198/
package binary_search;

import java.util.*;

public class LeetCode198_BinarySearch198 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode198_BinarySearch198 solver = new LeetCode198_BinarySearch198();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode198_BinarySearch198 Passed!");
    }
}
