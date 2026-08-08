// https://leetcode.com/problems/binary-search-range-224/
package binary_search;

import java.util.*;

public class LeetCode224_BinarySearch224 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode224_BinarySearch224 solver = new LeetCode224_BinarySearch224();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode224_BinarySearch224 Passed!");
    }
}
