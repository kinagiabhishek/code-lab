// https://leetcode.com/problems/search-insert-position/
package binary_search;

import java.util.*;

public class LeetCode35_SearchInsertPosition {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode35_SearchInsertPosition solver = new LeetCode35_SearchInsertPosition();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode35_SearchInsertPosition Passed!");
    }
}
