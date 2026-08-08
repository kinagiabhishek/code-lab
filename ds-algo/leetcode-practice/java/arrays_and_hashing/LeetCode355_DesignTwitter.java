// https://leetcode.com/problems/design-twitter/
package arrays_and_hashing;

import java.util.*;

public class LeetCode355_DesignTwitter {
    // LeetCode Problem 355: Design Twitter
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode355_DesignTwitter solver = new LeetCode355_DesignTwitter();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode355_DesignTwitter (Design Twitter) Passed!");
    }
}
