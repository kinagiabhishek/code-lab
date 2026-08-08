// https://leetcode.com/problems/longest-consecutive-sequence/
package arrays_and_hashing;

import java.util.*;

public class LongestConsecutiveSequence {
public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>(); for (int n : nums) set.add(n);
        int max = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int curr = n, len = 1;
                while (set.contains(curr + 1)) { curr++; len++; }
                max = Math.max(max, len);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        LongestConsecutiveSequence solver = new LongestConsecutiveSequence();
        assert solver.longestConsecutive(new int[]{100,4,200,1,3,2}) == 4;
        System.out.println("✅ LongestConsecutiveSequence Passed!");
    }
}
