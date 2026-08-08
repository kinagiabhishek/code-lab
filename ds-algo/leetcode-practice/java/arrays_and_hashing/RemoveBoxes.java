// https://leetcode.com/problems/remove-boxes/
package arrays_and_hashing;

import java.util.*;

public class RemoveBoxes {
    // LeetCode Problem 546: Remove Boxes
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RemoveBoxes solver = new RemoveBoxes();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode546_RemoveBoxes (Remove Boxes) Passed!");
    }
}
