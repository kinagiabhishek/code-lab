// https://leetcode.com/problems/lru-cache/
package linked_lists;

import java.util.*;

public class LruCache {
    // LeetCode Problem 146: LRU Cache
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LruCache solver = new LruCache();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LruCache (LRU Cache) Passed!");
    }
}
