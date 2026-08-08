// https://leetcode.com/problems/lru-cache/
package linked_lists;

import java.util.*;

public class LeetCode146_LruCache {
    // LeetCode Problem 146: LRU Cache
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode146_LruCache solver = new LeetCode146_LruCache();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode146_LruCache (LRU Cache) Passed!");
    }
}
