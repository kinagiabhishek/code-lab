// https://leetcode.com/problems/problem-bit-572/
package bit_manipulation;

import java.util.*;

public class LeetCode572_BitManipulationProblem572 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode572_BitManipulationProblem572 solver = new LeetCode572_BitManipulationProblem572();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode572_BitManipulationProblem572 Passed!");
    }
}
