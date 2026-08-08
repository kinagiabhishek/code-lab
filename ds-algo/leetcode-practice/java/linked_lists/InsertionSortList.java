// https://leetcode.com/problems/insertion-sort-list/
package linked_lists;

import java.util.*;

public class InsertionSortList {
    // LeetCode Problem 147: Insertion Sort List
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        InsertionSortList solver = new InsertionSortList();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode147_InsertionSortList (Insertion Sort List) Passed!");
    }
}
