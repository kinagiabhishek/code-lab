// https://leetcode.com/problems/problem-bit-577/
package bit_manipulation;

import java.util.*;

public class LeetCode577_BitManipulationProblem577 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode577_BitManipulationProblem577 solver = new LeetCode577_BitManipulationProblem577();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode577_BitManipulationProblem577 Passed!");
    }
}
