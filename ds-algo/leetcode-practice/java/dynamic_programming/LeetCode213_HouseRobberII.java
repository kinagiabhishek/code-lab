// https://leetcode.com/problems/house-robber-ii/
package dynamic_programming;
public class LeetCode213_HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(robHelper(nums, 0, nums.length - 2), robHelper(nums, 1, nums.length - 1));
    }
    private int robHelper(int[] nums, int start, int end) {
        int rob1 = 0, rob2 = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(nums[i] + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
    public static void main(String[] args) {
        assert new LeetCode213_HouseRobberII().rob(new int[]{2, 3, 2}) == 3;
        System.out.println("✅ LeetCode213_HouseRobberII Passed!");
    }
}
