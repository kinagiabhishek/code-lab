// https://leetcode.com/problems/problem-bit-571/
package bit_manipulation;

import java.util.*;

public class LeetCode571_BitManipulationProblem571 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode571_BitManipulationProblem571 solver = new LeetCode571_BitManipulationProblem571();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode571_BitManipulationProblem571 Passed!");
    }
}
