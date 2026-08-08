// https://leetcode.com/problems/two-sum/
package arrays_and_hashing;
import java.util.*;
public class LeetCode1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[] { map.get(complement), i };
            map.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        assert Arrays.equals(new LeetCode1_TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        System.out.println("✅ LeetCode1_TwoSum Passed!");
    }
}
