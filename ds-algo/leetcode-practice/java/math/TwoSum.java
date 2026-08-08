// https://leetcode.com/problems/two-sum/
package math;

import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) return new int[] { map.get(comp), i };
            map.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        TwoSum solver = new TwoSum();
        assert Arrays.equals(solver.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        System.out.println("✅ LeetCode1_TwoSum Passed!");
    }
}
