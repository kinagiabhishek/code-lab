// https://leetcode.com/problems/problem-array-24/
package arrays_and_hashing;

import java.util.*;

public class LeetCode24_ArrayProblem24 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode24_ArrayProblem24 solver = new LeetCode24_ArrayProblem24();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode24_ArrayProblem24 Passed!");
    }
}
