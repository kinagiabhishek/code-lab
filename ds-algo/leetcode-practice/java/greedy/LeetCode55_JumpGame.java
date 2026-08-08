// https://leetcode.com/problems/jump-game/
package greedy;
public class LeetCode55_JumpGame {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) if (i + nums[i] >= goal) goal = i;
        return goal == 0;
    }
    public static void main(String[] args) {
        assert new LeetCode55_JumpGame().canJump(new int[]{2,3,1,1,4}) == true;
        System.out.println("✅ LeetCode55_JumpGame Passed!");
    }
}
