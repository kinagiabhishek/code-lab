// https://leetcode.com/problems/problem-bit-559/
package bit_manipulation;

import java.util.*;

public class LeetCode559_BitManipulationProblem559 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode559_BitManipulationProblem559 solver = new LeetCode559_BitManipulationProblem559();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode559_BitManipulationProblem559 Passed!");
    }
}
