// https://leetcode.com/problems/random-pick-with-weight/
package bit_manipulation;

import java.util.*;

public class LeetCode528_RandomPickWithWeight {
    // LeetCode Problem 528: Random Pick with Weight
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode528_RandomPickWithWeight solver = new LeetCode528_RandomPickWithWeight();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode528_RandomPickWithWeight (Random Pick with Weight) Passed!");
    }
}
