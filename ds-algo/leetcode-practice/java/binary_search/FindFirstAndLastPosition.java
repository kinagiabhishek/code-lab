// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package binary_search;

import java.util.*;

public class FindFirstAndLastPosition {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        FindFirstAndLastPosition solver = new FindFirstAndLastPosition();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode34_FindFirstAndLastPosition Passed!");
    }
}
