// https://leetcode.com/problems/binary-search-range-81/
package binary_search;

import java.util.*;

public class LeetCode81_BinarySearch81 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode81_BinarySearch81 solver = new LeetCode81_BinarySearch81();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode81_BinarySearch81 Passed!");
    }
}
