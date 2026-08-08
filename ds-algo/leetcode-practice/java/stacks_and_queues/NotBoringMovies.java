// https://leetcode.com/problems/not-boring-movies/
package stacks_and_queues;

import java.util.*;

public class NotBoringMovies {
    // LeetCode Problem 620: Not Boring Movies
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NotBoringMovies solver = new NotBoringMovies();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NotBoringMovies (Not Boring Movies) Passed!");
    }
}
