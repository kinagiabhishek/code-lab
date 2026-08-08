// https://leetcode.com/problems/problem-array-28/
package arrays_and_hashing;

import java.util.*;

public class LeetCode28_ArrayProblem28 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode28_ArrayProblem28 solver = new LeetCode28_ArrayProblem28();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode28_ArrayProblem28 Passed!");
    }
}
