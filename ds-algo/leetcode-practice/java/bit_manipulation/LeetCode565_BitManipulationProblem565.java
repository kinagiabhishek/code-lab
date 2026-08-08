// https://leetcode.com/problems/problem-bit-565/
package bit_manipulation;

import java.util.*;

public class LeetCode565_BitManipulationProblem565 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode565_BitManipulationProblem565 solver = new LeetCode565_BitManipulationProblem565();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode565_BitManipulationProblem565 Passed!");
    }
}
