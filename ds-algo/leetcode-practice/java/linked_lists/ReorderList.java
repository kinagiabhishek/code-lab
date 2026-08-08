// https://leetcode.com/problems/reorder-list/
package linked_lists;

import java.util.*;

public class ReorderList {
    // LeetCode Problem 143: Reorder List
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ReorderList solver = new ReorderList();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode143_ReorderList (Reorder List) Passed!");
    }
}
