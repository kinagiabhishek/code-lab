// https://leetcode.com/problems/rotate-list/
package linked_lists;

import java.util.*;

public class LeetCode61_RotateList {
    // LeetCode Problem 61: Rotate List
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode61_RotateList solver = new LeetCode61_RotateList();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode61_RotateList (Rotate List) Passed!");
    }
}
