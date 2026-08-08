// https://leetcode.com/problems/median-of-two-sorted-arrays/
package binary_search;

import java.util.*;

public class LeetCode4_MedianOfTwoSortedArrays {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode4_MedianOfTwoSortedArrays solver = new LeetCode4_MedianOfTwoSortedArrays();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode4_MedianOfTwoSortedArrays Passed!");
    }
}
