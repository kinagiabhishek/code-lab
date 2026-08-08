// https://leetcode.com/problems/problem-bit-569/
package bit_manipulation;

import java.util.*;

public class LeetCode569_BitManipulationProblem569 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode569_BitManipulationProblem569 solver = new LeetCode569_BitManipulationProblem569();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode569_BitManipulationProblem569 Passed!");
    }
}
