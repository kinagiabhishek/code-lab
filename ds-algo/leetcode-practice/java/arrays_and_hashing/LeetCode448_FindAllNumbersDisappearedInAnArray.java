// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
package arrays_and_hashing;
import java.util.*;
public class LeetCode448_FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) nums[idx] = -nums[idx];
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) res.add(i + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        assert new LeetCode448_FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}).size() == 2;
        System.out.println("✅ LeetCode448_FindAllNumbersDisappearedInAnArray Passed!");
    }
}
