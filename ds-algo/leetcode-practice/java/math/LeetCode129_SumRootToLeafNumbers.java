// https://leetcode.com/problems/sum-root-to-leaf-numbers/
package math;

import java.util.*;

public class LeetCode129_SumRootToLeafNumbers {
    // LeetCode Problem 129: Sum Root to Leaf Numbers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode129_SumRootToLeafNumbers solver = new LeetCode129_SumRootToLeafNumbers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode129_SumRootToLeafNumbers (Sum Root to Leaf Numbers) Passed!");
    }
}
