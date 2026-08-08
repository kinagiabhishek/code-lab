package backtracking;
import java.util.*;
public class LeetCode46_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) res.add(new ArrayList<>(temp));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                backtrack(res, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        assert new LeetCode46_Permutations().permute(new int[]{1,2,3}).size() == 6;
        System.out.println("✅ LeetCode46_Permutations Passed!");
    }
}
