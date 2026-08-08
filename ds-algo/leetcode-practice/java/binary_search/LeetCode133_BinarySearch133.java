// https://leetcode.com/problems/binary-search-range-133/
package binary_search;

import java.util.*;

public class LeetCode133_BinarySearch133 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode133_BinarySearch133 solver = new LeetCode133_BinarySearch133();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode133_BinarySearch133 Passed!");
    }
}
