// https://leetcode.com/problems/problem-bit-556/
package bit_manipulation;

import java.util.*;

public class LeetCode556_BitManipulationProblem556 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode556_BitManipulationProblem556 solver = new LeetCode556_BitManipulationProblem556();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode556_BitManipulationProblem556 Passed!");
    }
}
