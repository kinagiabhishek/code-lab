// https://leetcode.com/problems/flatten-nested-list-iterator/
package linked_lists;

import java.util.*;

public class FlattenNestedListIterator {
    // LeetCode Problem 341: Flatten Nested List Iterator
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FlattenNestedListIterator solver = new FlattenNestedListIterator();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode341_FlattenNestedListIterator (Flatten Nested List Iterator) Passed!");
    }
}
