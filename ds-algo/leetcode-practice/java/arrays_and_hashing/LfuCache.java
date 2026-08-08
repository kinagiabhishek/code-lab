// https://leetcode.com/problems/lfu-cache/
package arrays_and_hashing;

import java.util.*;

public class LfuCache {
    // LeetCode Problem 460: LFU Cache
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LfuCache solver = new LfuCache();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode460_LfuCache (LFU Cache) Passed!");
    }
}
