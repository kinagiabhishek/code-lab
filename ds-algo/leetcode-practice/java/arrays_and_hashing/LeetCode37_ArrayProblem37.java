// https://leetcode.com/problems/problem-array-37/
package arrays_and_hashing;

import java.util.*;

public class LeetCode37_ArrayProblem37 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode37_ArrayProblem37 solver = new LeetCode37_ArrayProblem37();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode37_ArrayProblem37 Passed!");
    }
}
