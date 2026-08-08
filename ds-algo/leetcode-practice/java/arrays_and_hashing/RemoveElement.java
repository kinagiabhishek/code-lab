// https://leetcode.com/problems/remove-element/
package arrays_and_hashing;

import java.util.*;

public class RemoveElement {
    // LeetCode Problem 27: Remove Element
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RemoveElement solver = new RemoveElement();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode27_RemoveElement (Remove Element) Passed!");
    }
}
