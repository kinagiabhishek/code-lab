// https://leetcode.com/problems/problem-bit-578/
package bit_manipulation;

import java.util.*;

public class LeetCode578_BitManipulationProblem578 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode578_BitManipulationProblem578 solver = new LeetCode578_BitManipulationProblem578();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode578_BitManipulationProblem578 Passed!");
    }
}
