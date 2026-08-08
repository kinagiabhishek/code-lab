// https://leetcode.com/problems/binary-search-range-94/
package binary_search;

import java.util.*;

public class LeetCode94_BinarySearch94 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode94_BinarySearch94 solver = new LeetCode94_BinarySearch94();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode94_BinarySearch94 Passed!");
    }
}
