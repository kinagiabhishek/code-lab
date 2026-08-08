// https://leetcode.com/problems/problem-array-49/
package arrays_and_hashing;

import java.util.*;

public class LeetCode49_ArrayProblem49 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode49_ArrayProblem49 solver = new LeetCode49_ArrayProblem49();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode49_ArrayProblem49 Passed!");
    }
}
