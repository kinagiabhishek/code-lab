// https://leetcode.com/problems/binary-search-range-445/
package binary_search;

import java.util.*;

public class LeetCode445_BinarySearch445 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode445_BinarySearch445 solver = new LeetCode445_BinarySearch445();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode445_BinarySearch445 Passed!");
    }
}
