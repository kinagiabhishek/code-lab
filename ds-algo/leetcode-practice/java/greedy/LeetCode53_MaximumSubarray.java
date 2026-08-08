package greedy;

public class LeetCode53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        LeetCode53_MaximumSubarray solver = new LeetCode53_MaximumSubarray();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ LeetCode53_MaximumSubarray Passed!");
    }
}
