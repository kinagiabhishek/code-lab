// https://leetcode.com/problems/problem-bit-579/
package bit_manipulation;

import java.util.*;

public class LeetCode579_BitManipulationProblem579 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode579_BitManipulationProblem579 solver = new LeetCode579_BitManipulationProblem579();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode579_BitManipulationProblem579 Passed!");
    }
}
