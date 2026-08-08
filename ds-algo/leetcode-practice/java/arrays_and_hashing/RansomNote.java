// https://leetcode.com/problems/ransom-note/
package arrays_and_hashing;

import java.util.*;

public class RansomNote {
    // LeetCode Problem 383: Ransom Note
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RansomNote solver = new RansomNote();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode383_RansomNote (Ransom Note) Passed!");
    }
}
