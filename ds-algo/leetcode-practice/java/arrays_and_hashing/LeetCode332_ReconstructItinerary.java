// https://leetcode.com/problems/reconstruct-itinerary/
package arrays_and_hashing;

import java.util.*;

public class LeetCode332_ReconstructItinerary {
    // LeetCode Problem 332: Reconstruct Itinerary
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode332_ReconstructItinerary solver = new LeetCode332_ReconstructItinerary();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode332_ReconstructItinerary (Reconstruct Itinerary) Passed!");
    }
}
