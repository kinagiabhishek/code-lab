// https://leetcode.com/problems/combination-sum/
package backtracking;
import java.util.*;
public class LeetCode39_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums, int remain, int start) {
        if (remain < 0) return;
        if (remain == 0) res.add(new ArrayList<>(list));
        else {
            for (int i = start; i < nums.length; i++) {
                list.add(nums[i]); backtrack(res, list, nums, remain - nums[i], i); list.remove(list.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        assert new LeetCode39_CombinationSum().combinationSum(new int[]{2,3,6,7}, 7).size() == 2;
        System.out.println("✅ LeetCode39_CombinationSum Passed!");
    }
}
