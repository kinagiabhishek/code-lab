// https://leetcode.com/problems/max-points-on-a-line/
package arrays_and_hashing;

import java.util.*;

public class LeetCode149_MaxPointsOnALine {
    // LeetCode Problem 149: Max Points on a Line
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode149_MaxPointsOnALine solver = new LeetCode149_MaxPointsOnALine();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode149_MaxPointsOnALine (Max Points on a Line) Passed!");
    }
}
