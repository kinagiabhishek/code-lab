// https://leetcode.com/problems/maximum-product-subarray/
package dynamic_programming;
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        int max = nums[0], min = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) { int temp = max; max = min; min = temp; }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            res = Math.max(res, max);
        }
        return res;
    }
    public static void main(String[] args) {
        assert new MaximumProductSubarray().maxProduct(new int[]{2,3,-2,4}) == 6;
        System.out.println("✅ LeetCode152_MaximumProductSubarray Passed!");
    }
}
