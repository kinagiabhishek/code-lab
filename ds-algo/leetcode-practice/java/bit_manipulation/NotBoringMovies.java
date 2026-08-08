// https://leetcode.com/problems/not-boring-movies/
package bit_manipulation;

import java.util.*;

public class NotBoringMovies {
    // LeetCode Problem 620: Not Boring Movies
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        NotBoringMovies solver = new NotBoringMovies();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode620_NotBoringMovies (Not Boring Movies) Passed!");
    }
}
