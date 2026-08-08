// https://leetcode.com/problems/binary-search-range-328/
package binary_search;

import java.util.*;

public class LeetCode328_BinarySearch328 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode328_BinarySearch328 solver = new LeetCode328_BinarySearch328();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode328_BinarySearch328 Passed!");
    }
}
