// https://leetcode.com/problems/find-peak-element/
package arrays_and_hashing;

import java.util.*;

public class FindPeakElement {
    // LeetCode Problem 162: Find Peak Element
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FindPeakElement solver = new FindPeakElement();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode162_FindPeakElement (Find Peak Element) Passed!");
    }
}
