// https://leetcode.com/problems/problem-bit-567/
package bit_manipulation;

import java.util.*;

public class LeetCode567_BitManipulationProblem567 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode567_BitManipulationProblem567 solver = new LeetCode567_BitManipulationProblem567();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode567_BitManipulationProblem567 Passed!");
    }
}
