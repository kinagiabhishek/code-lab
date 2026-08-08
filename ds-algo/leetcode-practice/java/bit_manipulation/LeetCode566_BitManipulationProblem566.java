// https://leetcode.com/problems/problem-bit-566/
package bit_manipulation;

import java.util.*;

public class LeetCode566_BitManipulationProblem566 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode566_BitManipulationProblem566 solver = new LeetCode566_BitManipulationProblem566();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode566_BitManipulationProblem566 Passed!");
    }
}
