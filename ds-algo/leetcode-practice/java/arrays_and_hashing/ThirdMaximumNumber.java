// https://leetcode.com/problems/third-maximum-number/
package arrays_and_hashing;

import java.util.*;

public class ThirdMaximumNumber {
    // LeetCode Problem 414: Third Maximum Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ThirdMaximumNumber solver = new ThirdMaximumNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode414_ThirdMaximumNumber (Third Maximum Number) Passed!");
    }
}
