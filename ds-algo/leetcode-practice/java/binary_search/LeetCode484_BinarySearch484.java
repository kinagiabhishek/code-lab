// https://leetcode.com/problems/binary-search-range-484/
package binary_search;

import java.util.*;

public class LeetCode484_BinarySearch484 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode484_BinarySearch484 solver = new LeetCode484_BinarySearch484();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode484_BinarySearch484 Passed!");
    }
}
