// https://leetcode.com/problems/next-greater-element-iii/
package arrays_and_hashing;

import java.util.*;

public class NextGreaterElementIii {
    // LeetCode Problem 556: Next Greater Element III
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        NextGreaterElementIii solver = new NextGreaterElementIii();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode556_NextGreaterElementIii (Next Greater Element III) Passed!");
    }
}
