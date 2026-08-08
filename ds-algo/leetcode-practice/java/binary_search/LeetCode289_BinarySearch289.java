// https://leetcode.com/problems/binary-search-range-289/
package binary_search;

import java.util.*;

public class LeetCode289_BinarySearch289 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode289_BinarySearch289 solver = new LeetCode289_BinarySearch289();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode289_BinarySearch289 Passed!");
    }
}
