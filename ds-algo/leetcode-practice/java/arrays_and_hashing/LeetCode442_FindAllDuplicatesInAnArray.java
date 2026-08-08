// https://leetcode.com/problems/find-all-duplicates-in-an-array/
package arrays_and_hashing;
import java.util.*;
public class LeetCode442_FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] < 0) res.add(Math.abs(nums[i]));
            else nums[idx] = -nums[idx];
        }
        return res;
    }
    public static void main(String[] args) {
        assert new LeetCode442_FindAllDuplicatesInAnArray().findDuplicates(new int[]{4,3,2,7,8,2,3,1}).size() == 2;
        System.out.println("✅ LeetCode442_FindAllDuplicatesInAnArray Passed!");
    }
}
