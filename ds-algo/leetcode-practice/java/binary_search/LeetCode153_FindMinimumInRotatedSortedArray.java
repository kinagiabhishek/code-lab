// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
package binary_search;
public class LeetCode153_FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l)/2;
            if (nums[mid] > nums[r]) l = mid + 1;
            else r = mid;
        }
        return nums[l];
    }
    public static void main(String[] args) {
        assert new LeetCode153_FindMinimumInRotatedSortedArray().findMin(new int[]{3,4,5,1,2}) == 1;
        System.out.println("✅ LeetCode153_FindMinimumInRotatedSortedArray Passed!");
    }
}
