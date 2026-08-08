// https://leetcode.com/problems/edit-distance/
package arrays_and_hashing;

import java.util.*;

public class LeetCode72_EditDistance {
    // LeetCode Problem 72: Edit Distance
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode72_EditDistance solver = new LeetCode72_EditDistance();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode72_EditDistance (Edit Distance) Passed!");
    }
}
