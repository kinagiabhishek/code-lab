// https://leetcode.com/problems/search-insert-position/
package binary_search;

import java.util.*;

public class SearchInsertPosition {
public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) l = mid + 1; else r = mid - 1;
        }
        return l;
    }
    public static void main(String[] args) {
        SearchInsertPosition solver = new SearchInsertPosition();
        assert solver.searchInsert(new int[]{1,3,5,6}, 5) == 2;
        System.out.println("✅ SearchInsertPosition Passed!");
    }
}
