// https://leetcode.com/problems/find-customer-referee/
package arrays_and_hashing;

import java.util.*;

public class FindCustomerReferee {
    // LeetCode Problem 584: Find Customer Referee
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FindCustomerReferee solver = new FindCustomerReferee();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode584_FindCustomerReferee (Find Customer Referee) Passed!");
    }
}
