// https://leetcode.com/problems/problem-array-31/
package arrays_and_hashing;

import java.util.*;

public class LeetCode31_ArrayProblem31 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode31_ArrayProblem31 solver = new LeetCode31_ArrayProblem31();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode31_ArrayProblem31 Passed!");
    }
}
