// https://leetcode.com/problems/number-of-segments-in-a-string/
package arrays_and_hashing;

import java.util.*;

public class NumberOfSegmentsInAString {
    // LeetCode Problem 434: Number of Segments in a String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        NumberOfSegmentsInAString solver = new NumberOfSegmentsInAString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode434_NumberOfSegmentsInAString (Number of Segments in a String) Passed!");
    }
}
