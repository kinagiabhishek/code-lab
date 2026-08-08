// https://leetcode.com/problems/longest-increasing-subsequence/
package dynamic_programming;
import java.util.Arrays;
public class LeetCode300_LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length]; Arrays.fill(dp, 1); int max = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        assert new LeetCode300_LongestIncreasingSubsequence().lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}) == 4;
        System.out.println("✅ LeetCode300_LongestIncreasingSubsequence Passed!");
    }
}
