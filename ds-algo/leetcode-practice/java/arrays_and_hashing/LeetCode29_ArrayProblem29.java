// https://leetcode.com/problems/problem-array-29/
package arrays_and_hashing;

import java.util.*;

public class LeetCode29_ArrayProblem29 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode29_ArrayProblem29 solver = new LeetCode29_ArrayProblem29();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode29_ArrayProblem29 Passed!");
    }
}
