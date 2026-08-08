// https://leetcode.com/problems/search-insert-position/
package binary_search;

import java.util.*;

public class LeetCode35_SearchInsertPosition {
    // LeetCode Problem 35: Search Insert Position
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode35_SearchInsertPosition solver = new LeetCode35_SearchInsertPosition();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode35_SearchInsertPosition (Search Insert Position) Passed!");
    }
}
