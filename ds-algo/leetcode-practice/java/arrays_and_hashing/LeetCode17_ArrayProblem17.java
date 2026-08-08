// https://leetcode.com/problems/problem-array-17/
package arrays_and_hashing;

import java.util.*;

public class LeetCode17_ArrayProblem17 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode17_ArrayProblem17 solver = new LeetCode17_ArrayProblem17();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode17_ArrayProblem17 Passed!");
    }
}
