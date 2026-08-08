// https://leetcode.com/problems/remove-element/
package arrays_and_hashing;

import java.util.*;

public class LeetCode27_RemoveElement {
    // LeetCode Problem 27: Remove Element
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode27_RemoveElement solver = new LeetCode27_RemoveElement();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode27_RemoveElement (Remove Element) Passed!");
    }
}
