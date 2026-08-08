// https://leetcode.com/problems/contains-duplicate/
package arrays_and_hashing;
import java.util.*;
public class LeetCode217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) if (!set.add(n)) return true;
        return false;
    }
    public static void main(String[] args) {
        assert new LeetCode217_ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1}) == true;
        System.out.println("✅ LeetCode217_ContainsDuplicate Passed!");
    }
}
