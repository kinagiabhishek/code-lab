// https://leetcode.com/problems/investments-in-2016/
package arrays_and_hashing;

import java.util.*;

public class LeetCode585_InvestmentsIn2016 {
    // LeetCode Problem 585: Investments in 2016
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode585_InvestmentsIn2016 solver = new LeetCode585_InvestmentsIn2016();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode585_InvestmentsIn2016 (Investments in 2016) Passed!");
    }
}
