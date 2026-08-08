// https://leetcode.com/problems/problem-bit-570/
package bit_manipulation;

import java.util.*;

public class LeetCode570_BitManipulationProblem570 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode570_BitManipulationProblem570 solver = new LeetCode570_BitManipulationProblem570();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode570_BitManipulationProblem570 Passed!");
    }
}
