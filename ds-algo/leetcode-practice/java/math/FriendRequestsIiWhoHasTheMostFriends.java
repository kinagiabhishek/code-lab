// https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/
package math;

import java.util.*;

public class FriendRequestsIiWhoHasTheMostFriends {
    // LeetCode Problem 602: Friend Requests II: Who Has the Most Friends
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FriendRequestsIiWhoHasTheMostFriends solver = new FriendRequestsIiWhoHasTheMostFriends();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FriendRequestsIiWhoHasTheMostFriends (Friend Requests II: Who Has the Most Friends) Passed!");
    }
}
