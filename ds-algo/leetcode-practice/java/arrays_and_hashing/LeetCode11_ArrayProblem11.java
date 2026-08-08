// https://leetcode.com/problems/problem-array-11/
package arrays_and_hashing;

import java.util.*;

public class LeetCode11_ArrayProblem11 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode11_ArrayProblem11 solver = new LeetCode11_ArrayProblem11();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode11_ArrayProblem11 Passed!");
    }
}
