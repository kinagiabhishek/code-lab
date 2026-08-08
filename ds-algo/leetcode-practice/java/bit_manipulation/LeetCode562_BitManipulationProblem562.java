// https://leetcode.com/problems/problem-bit-562/
package bit_manipulation;

import java.util.*;

public class LeetCode562_BitManipulationProblem562 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode562_BitManipulationProblem562 solver = new LeetCode562_BitManipulationProblem562();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode562_BitManipulationProblem562 Passed!");
    }
}
