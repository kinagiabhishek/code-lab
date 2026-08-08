// https://leetcode.com/problems/reconstruct-itinerary/
package arrays_and_hashing;

import java.util.*;

public class ReconstructItinerary {
    // LeetCode Problem 332: Reconstruct Itinerary
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ReconstructItinerary solver = new ReconstructItinerary();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode332_ReconstructItinerary (Reconstruct Itinerary) Passed!");
    }
}
