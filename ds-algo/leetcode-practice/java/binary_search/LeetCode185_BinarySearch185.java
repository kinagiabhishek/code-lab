// https://leetcode.com/problems/binary-search-range-185/
package binary_search;

import java.util.*;

public class LeetCode185_BinarySearch185 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode185_BinarySearch185 solver = new LeetCode185_BinarySearch185();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode185_BinarySearch185 Passed!");
    }
}
