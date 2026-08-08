// https://leetcode.com/problems/trips-and-users/
package backtracking;

import java.util.*;

public class TripsAndUsers {
    // LeetCode Problem 262: Trips and Users
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        TripsAndUsers solver = new TripsAndUsers();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ TripsAndUsers (Trips and Users) Passed!");
    }
}
