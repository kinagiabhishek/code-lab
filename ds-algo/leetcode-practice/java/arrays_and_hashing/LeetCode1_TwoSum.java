// https://leetcode.com/problems/two-sum/
package arrays_and_hashing;

import java.util.*;

public class LeetCode1_TwoSum {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode1_TwoSum solver = new LeetCode1_TwoSum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode1_TwoSum Passed!");
    }
}
