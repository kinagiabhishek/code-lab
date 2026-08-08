// https://leetcode.com/problems/binary-search-range-393/
package binary_search;

import java.util.*;

public class LeetCode393_BinarySearch393 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode393_BinarySearch393 solver = new LeetCode393_BinarySearch393();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode393_BinarySearch393 Passed!");
    }
}
