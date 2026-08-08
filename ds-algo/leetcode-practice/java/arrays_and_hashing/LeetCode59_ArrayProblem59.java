// https://leetcode.com/problems/problem-array-59/
package arrays_and_hashing;

import java.util.*;

public class LeetCode59_ArrayProblem59 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode59_ArrayProblem59 solver = new LeetCode59_ArrayProblem59();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode59_ArrayProblem59 Passed!");
    }
}
