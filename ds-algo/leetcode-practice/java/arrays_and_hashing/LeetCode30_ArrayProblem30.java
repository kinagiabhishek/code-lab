// https://leetcode.com/problems/problem-array-30/
package arrays_and_hashing;

import java.util.*;

public class LeetCode30_ArrayProblem30 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode30_ArrayProblem30 solver = new LeetCode30_ArrayProblem30();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode30_ArrayProblem30 Passed!");
    }
}
