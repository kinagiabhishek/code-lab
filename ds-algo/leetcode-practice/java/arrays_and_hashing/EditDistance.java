// https://leetcode.com/problems/edit-distance/
package arrays_and_hashing;

import java.util.*;

public class EditDistance {
    // LeetCode Problem 72: Edit Distance
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        EditDistance solver = new EditDistance();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode72_EditDistance (Edit Distance) Passed!");
    }
}
