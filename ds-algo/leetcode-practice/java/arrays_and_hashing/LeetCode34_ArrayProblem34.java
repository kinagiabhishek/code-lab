// https://leetcode.com/problems/problem-array-34/
package arrays_and_hashing;

import java.util.*;

public class LeetCode34_ArrayProblem34 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode34_ArrayProblem34 solver = new LeetCode34_ArrayProblem34();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode34_ArrayProblem34 Passed!");
    }
}
