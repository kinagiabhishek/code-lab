// https://leetcode.com/problems/binary-search-range-341/
package binary_search;

import java.util.*;

public class LeetCode341_BinarySearch341 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode341_BinarySearch341 solver = new LeetCode341_BinarySearch341();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode341_BinarySearch341 Passed!");
    }
}
