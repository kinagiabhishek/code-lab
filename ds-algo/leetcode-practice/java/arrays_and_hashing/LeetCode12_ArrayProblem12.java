// https://leetcode.com/problems/problem-array-12/
package arrays_and_hashing;

import java.util.*;

public class LeetCode12_ArrayProblem12 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode12_ArrayProblem12 solver = new LeetCode12_ArrayProblem12();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode12_ArrayProblem12 Passed!");
    }
}
