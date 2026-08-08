// https://leetcode.com/problems/problem-array-51/
package arrays_and_hashing;

import java.util.*;

public class LeetCode51_ArrayProblem51 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode51_ArrayProblem51 solver = new LeetCode51_ArrayProblem51();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode51_ArrayProblem51 Passed!");
    }
}
