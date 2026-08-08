// https://leetcode.com/problems/problem-array-53/
package arrays_and_hashing;

import java.util.*;

public class LeetCode53_ArrayProblem53 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode53_ArrayProblem53 solver = new LeetCode53_ArrayProblem53();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode53_ArrayProblem53 Passed!");
    }
}
