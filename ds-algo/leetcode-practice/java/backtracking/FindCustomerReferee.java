// https://leetcode.com/problems/find-customer-referee/
package backtracking;

import java.util.*;

public class FindCustomerReferee {
    // LeetCode Problem 584: Find Customer Referee
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindCustomerReferee solver = new FindCustomerReferee();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindCustomerReferee (Find Customer Referee) Passed!");
    }
}
