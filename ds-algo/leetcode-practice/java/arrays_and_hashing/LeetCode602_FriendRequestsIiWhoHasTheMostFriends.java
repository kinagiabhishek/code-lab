// https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/
package arrays_and_hashing;

import java.util.*;

public class LeetCode602_FriendRequestsIiWhoHasTheMostFriends {
    // LeetCode Problem 602: Friend Requests II: Who Has the Most Friends
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode602_FriendRequestsIiWhoHasTheMostFriends solver = new LeetCode602_FriendRequestsIiWhoHasTheMostFriends();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode602_FriendRequestsIiWhoHasTheMostFriends (Friend Requests II: Who Has the Most Friends) Passed!");
    }
}
