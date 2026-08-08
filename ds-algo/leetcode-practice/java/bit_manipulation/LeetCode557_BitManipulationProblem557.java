// https://leetcode.com/problems/problem-bit-557/
package bit_manipulation;

import java.util.*;

public class LeetCode557_BitManipulationProblem557 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode557_BitManipulationProblem557 solver = new LeetCode557_BitManipulationProblem557();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode557_BitManipulationProblem557 Passed!");
    }
}
