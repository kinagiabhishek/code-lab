package arrays_and_hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/**
 * LeetCode 1: Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 * Difficulty: Easy
 */
public class LeetCode1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        LeetCode1_TwoSum solver = new LeetCode1_TwoSum();
        int[] result = solver.twoSum(new int[] {2, 7, 11, 15}, 9);
        assert Arrays.equals(result, new int[] {0, 1});
        System.out.println("✅ TwoSum Test Passed!");
    }
}
