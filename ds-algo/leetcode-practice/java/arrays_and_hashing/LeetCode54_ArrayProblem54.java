// https://leetcode.com/problems/problem-array-54/
package arrays_and_hashing;

import java.util.*;

public class LeetCode54_ArrayProblem54 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode54_ArrayProblem54 solver = new LeetCode54_ArrayProblem54();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode54_ArrayProblem54 Passed!");
    }
}
