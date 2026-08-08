// https://leetcode.com/problems/problem-bit-560/
package bit_manipulation;

import java.util.*;

public class LeetCode560_BitManipulationProblem560 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode560_BitManipulationProblem560 solver = new LeetCode560_BitManipulationProblem560();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode560_BitManipulationProblem560 Passed!");
    }
}
