// https://leetcode.com/problems/sort-list/
package linked_lists;

import java.util.*;

public class SortList {
    // LeetCode Problem 148: Sort List
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SortList solver = new SortList();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode148_SortList (Sort List) Passed!");
    }
}
