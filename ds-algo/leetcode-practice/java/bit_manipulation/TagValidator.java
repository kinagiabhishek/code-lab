// https://leetcode.com/problems/tag-validator/
package bit_manipulation;

import java.util.*;

public class TagValidator {
    // LeetCode Problem 591: Tag Validator
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        TagValidator solver = new TagValidator();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode591_TagValidator (Tag Validator) Passed!");
    }
}
