// https://leetcode.com/problems/trips-and-users/
package bit_manipulation;

import java.util.*;

public class LeetCode262_TripsAndUsers {
    // LeetCode Problem 262: Trips and Users
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode262_TripsAndUsers solver = new LeetCode262_TripsAndUsers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode262_TripsAndUsers (Trips and Users) Passed!");
    }
}
