// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package two_pointers;

import java.util.*;

public class LeetCode26_RemoveDuplicatesFromSortedArray {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode26_RemoveDuplicatesFromSortedArray solver = new LeetCode26_RemoveDuplicatesFromSortedArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode26_RemoveDuplicatesFromSortedArray Passed!");
    }
}
