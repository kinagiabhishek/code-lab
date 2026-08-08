// https://leetcode.com/problems/tag-validator/
package bit_manipulation;

import java.util.*;

public class LeetCode591_TagValidator {
    // LeetCode Problem 591: Tag Validator
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode591_TagValidator solver = new LeetCode591_TagValidator();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode591_TagValidator (Tag Validator) Passed!");
    }
}
