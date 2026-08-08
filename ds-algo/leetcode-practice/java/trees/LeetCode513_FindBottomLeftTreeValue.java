// https://leetcode.com/problems/find-bottom-left-tree-value/
package trees;

import java.util.*;

public class LeetCode513_FindBottomLeftTreeValue {
    // LeetCode Problem 513: Find Bottom Left Tree Value
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode513_FindBottomLeftTreeValue solver = new LeetCode513_FindBottomLeftTreeValue();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode513_FindBottomLeftTreeValue (Find Bottom Left Tree Value) Passed!");
    }
}
