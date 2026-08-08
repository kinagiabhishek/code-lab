// https://leetcode.com/problems/move-zeroes/
package two_pointers;

import java.util.*;

public class MoveZeroes {
public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) nums[insertPos++] = num;
        }
        while (insertPos < nums.length) nums[insertPos++] = 0;
    }
    public static void main(String[] args) {
        MoveZeroes solver = new MoveZeroes();
        int[] arr = {0,1,0,3,12};
        solver.moveZeroes(arr);
        assert Arrays.equals(arr, new int[]{1,3,12,0,0});
        System.out.println("✅ MoveZeroes Passed!");
    }
}
