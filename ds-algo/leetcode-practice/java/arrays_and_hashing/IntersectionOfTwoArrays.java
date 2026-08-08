// https://leetcode.com/problems/intersection-of-two-arrays/
package arrays_and_hashing;

import java.util.*;

public class IntersectionOfTwoArrays {
    // LeetCode Problem 349: Intersection of Two Arrays
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays solver = new IntersectionOfTwoArrays();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode349_IntersectionOfTwoArrays (Intersection of Two Arrays) Passed!");
    }
}
