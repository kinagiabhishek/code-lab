// https://leetcode.com/problems/problem-array-47/
package arrays_and_hashing;

import java.util.*;

public class LeetCode47_ArrayProblem47 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode47_ArrayProblem47 solver = new LeetCode47_ArrayProblem47();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode47_ArrayProblem47 Passed!");
    }
}
