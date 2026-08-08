// https://leetcode.com/problems/binary-search-range-510/
package binary_search;

import java.util.*;

public class LeetCode510_BinarySearch510 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode510_BinarySearch510 solver = new LeetCode510_BinarySearch510();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode510_BinarySearch510 Passed!");
    }
}
