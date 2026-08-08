// https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/
package bit_manipulation;

import java.util.*;

public class FriendRequestsIiWhoHasTheMostFriends {
    // LeetCode Problem 602: Friend Requests II: Who Has the Most Friends
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxSoFar = nums[0], currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        FriendRequestsIiWhoHasTheMostFriends solver = new FriendRequestsIiWhoHasTheMostFriends();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ FriendRequestsIiWhoHasTheMostFriends Passed!");
    }
}
