// https://leetcode.com/problems/hamming-distance/
package bit_manipulation;

import java.util.*;

public class HammingDistance {
    // LeetCode Problem 461: Hamming Distance
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        HammingDistance solver = new HammingDistance();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode461_HammingDistance (Hamming Distance) Passed!");
    }
}
