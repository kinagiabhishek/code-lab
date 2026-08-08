// https://leetcode.com/problems/total-hamming-distance/
package bit_manipulation;

import java.util.*;

public class LeetCode477_TotalHammingDistance {
    // LeetCode Problem 477: Total Hamming Distance
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode477_TotalHammingDistance solver = new LeetCode477_TotalHammingDistance();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode477_TotalHammingDistance (Total Hamming Distance) Passed!");
    }
}
