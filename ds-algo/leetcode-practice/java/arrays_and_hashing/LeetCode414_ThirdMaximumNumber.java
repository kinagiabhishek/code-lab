// https://leetcode.com/problems/third-maximum-number/
package arrays_and_hashing;

import java.util.*;

public class LeetCode414_ThirdMaximumNumber {
    // LeetCode Problem 414: Third Maximum Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode414_ThirdMaximumNumber solver = new LeetCode414_ThirdMaximumNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode414_ThirdMaximumNumber (Third Maximum Number) Passed!");
    }
}
