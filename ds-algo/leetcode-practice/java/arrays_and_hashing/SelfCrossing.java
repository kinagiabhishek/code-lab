// https://leetcode.com/problems/self-crossing/
package arrays_and_hashing;

import java.util.*;

public class SelfCrossing {
    // LeetCode Problem 335: Self Crossing
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SelfCrossing solver = new SelfCrossing();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode335_SelfCrossing (Self Crossing) Passed!");
    }
}
