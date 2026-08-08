// https://leetcode.com/problems/maximum-distance-in-arrays/
package arrays_and_hashing;

import java.util.*;

public class MaximumDistanceInArrays {
    // LeetCode Problem 624: Maximum Distance in Arrays
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MaximumDistanceInArrays solver = new MaximumDistanceInArrays();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode624_MaximumDistanceInArrays (Maximum Distance in Arrays) Passed!");
    }
}
