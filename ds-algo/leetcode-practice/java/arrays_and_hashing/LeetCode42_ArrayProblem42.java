// https://leetcode.com/problems/problem-array-42/
package arrays_and_hashing;

import java.util.*;

public class LeetCode42_ArrayProblem42 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode42_ArrayProblem42 solver = new LeetCode42_ArrayProblem42();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode42_ArrayProblem42 Passed!");
    }
}
