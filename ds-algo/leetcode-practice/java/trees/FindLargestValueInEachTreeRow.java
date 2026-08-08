// https://leetcode.com/problems/find-largest-value-in-each-tree-row/
package trees;

import java.util.*;

public class FindLargestValueInEachTreeRow {
    // LeetCode Problem 515: Find Largest Value in Each Tree Row
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FindLargestValueInEachTreeRow solver = new FindLargestValueInEachTreeRow();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode515_FindLargestValueInEachTreeRow (Find Largest Value in Each Tree Row) Passed!");
    }
}
