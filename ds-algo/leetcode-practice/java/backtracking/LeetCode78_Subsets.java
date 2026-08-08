// https://leetcode.com/problems/subsets/
package backtracking;
import java.util.*;
public class LeetCode78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]); backtrack(res, temp, nums, i + 1); temp.remove(temp.size() - 1);
        }
    }
    public static void main(String[] args) {
        assert new LeetCode78_Subsets().subsets(new int[]{1,2,3}).size() == 8;
        System.out.println("✅ LeetCode78_Subsets Passed!");
    }
}
