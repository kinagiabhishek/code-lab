// https://leetcode.com/problems/problem-backtrack-436/
package backtracking;

import java.util.*;

public class LeetCode436_BacktrackProblem436 {
    public List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        bt(res, new ArrayList<>(), nums, 0);
        return res;
    }
    private void bt(List<List<Integer>> res, List<Integer> tmp, int[] nums, int start) {
        res.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length; i++) {
            tmp.add(nums[i]); bt(res, tmp, nums, i + 1); tmp.remove(tmp.size() - 1);
        }
    }
    public static void main(String[] args) {
        LeetCode436_BacktrackProblem436 solver = new LeetCode436_BacktrackProblem436();
        assert solver.solve(new int[]{1,2}).size() == 4;
        System.out.println("✅ LeetCode436_BacktrackProblem436 Passed!");
    }
}
