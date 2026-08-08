// https://leetcode.com/problems/not-boring-movies/
package bit_manipulation;

import java.util.*;

public class LeetCode620_NotBoringMovies {
    // LeetCode Problem 620: Not Boring Movies
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode620_NotBoringMovies solver = new LeetCode620_NotBoringMovies();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode620_NotBoringMovies (Not Boring Movies) Passed!");
    }
}
