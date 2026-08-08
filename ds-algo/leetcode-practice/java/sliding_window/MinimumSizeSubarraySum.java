// https://leetcode.com/problems/minimum-size-subarray-sum/
package sliding_window;

import java.util.*;

public class MinimumSizeSubarraySum {
public int minSubArrayLen(int target, int[] nums) {
        int l = 0, sum = 0, minLen = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum >= target) {
                minLen = Math.min(minLen, r - l + 1);
                sum -= nums[l++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    public static void main(String[] args) {
        MinimumSizeSubarraySum solver = new MinimumSizeSubarraySum();
        assert solver.minSubArrayLen(7, new int[]{2,3,1,2,4,3}) == 2;
        System.out.println("✅ MinimumSizeSubarraySum Passed!");
    }
}
