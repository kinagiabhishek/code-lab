// https://leetcode.com/problems/find-the-duplicate-number/
package arrays_and_hashing;

import java.util.*;

public class FindTheDuplicateNumber {
public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do { slow = nums[slow]; fast = nums[nums[fast]]; } while (slow != fast);
        slow = nums[0];
        while (slow != fast) { slow = nums[slow]; fast = nums[fast]; }
        return slow;
    }
    public static void main(String[] args) {
        FindTheDuplicateNumber solver = new FindTheDuplicateNumber();
        assert solver.findDuplicate(new int[]{1,3,4,2,2}) == 2;
        System.out.println("✅ FindTheDuplicateNumber Passed!");
    }
}
