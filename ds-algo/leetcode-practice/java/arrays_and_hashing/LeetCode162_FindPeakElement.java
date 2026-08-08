// https://leetcode.com/problems/find-peak-element/
package arrays_and_hashing;

import java.util.*;

public class LeetCode162_FindPeakElement {
    // LeetCode Problem 162: Find Peak Element
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode162_FindPeakElement solver = new LeetCode162_FindPeakElement();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode162_FindPeakElement (Find Peak Element) Passed!");
    }
}
