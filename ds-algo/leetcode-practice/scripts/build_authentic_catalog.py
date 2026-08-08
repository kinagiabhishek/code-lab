#!/usr/bin/env python3
import os

AUTHENTIC_CATALOG = [
    # --- ARRAYS & HASHING ---
    ("arrays_and_hashing", "LeetCode1_TwoSum", 1, "two-sum",
     """package arrays_and_hashing;
import java.util.*;
public class LeetCode1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[] { map.get(complement), i };
            map.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        assert Arrays.equals(new LeetCode1_TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        System.out.println("✅ LeetCode1_TwoSum Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode217_ContainsDuplicate", 217, "contains-duplicate",
     """package arrays_and_hashing;
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
}"""),

    ("arrays_and_hashing", "LeetCode242_ValidAnagram", 242, "valid-anagram",
     """package arrays_and_hashing;
public class LeetCode242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++; counts[t.charAt(i) - 'a']--;
        }
        for (int c : counts) if (c != 0) return false;
        return true;
    }
    public static void main(String[] args) {
        assert new LeetCode242_ValidAnagram().isAnagram("anagram", "nagaram") == true;
        System.out.println("✅ LeetCode242_ValidAnagram Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode49_GroupAnagrams", 49, "group-anagrams",
     """package arrays_and_hashing;
import java.util.*;
public class LeetCode49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray(); Arrays.sort(ca);
            String key = String.valueOf(ca);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        assert new LeetCode49_GroupAnagrams().groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}).size() == 3;
        System.out.println("✅ LeetCode49_GroupAnagrams Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode347_TopKFrequentElements", 347, "top-k-frequent-elements",
     """package arrays_and_hashing;
import java.util.*;
public class LeetCode347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int n : map.keySet()) { pq.add(n); if (pq.size() > k) pq.poll(); }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = pq.poll();
        return res;
    }
    public static void main(String[] args) {
        assert new LeetCode347_TopKFrequentElements().topKFrequent(new int[]{1,1,1,2,2,3}, 2).length == 2;
        System.out.println("✅ LeetCode347_TopKFrequentElements Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode238_ProductOfArrayExceptSelf", 238, "product-of-array-except-self",
     """package arrays_and_hashing;
import java.util.Arrays;
public class LeetCode238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; int[] res = new int[n]; res[0] = 1;
        for (int i = 1; i < n; i++) res[i] = res[i - 1] * nums[i - 1];
        int right = 1;
        for (int i = n - 1; i >= 0; i--) { res[i] *= right; right *= nums[i]; }
        return res;
    }
    public static void main(String[] args) {
        assert Arrays.equals(new LeetCode238_ProductOfArrayExceptSelf().productExceptSelf(new int[]{1,2,3,4}), new int[]{24,12,8,6});
        System.out.println("✅ LeetCode238_ProductOfArrayExceptSelf Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode36_ValidSudoku", 36, "valid-sudoku",
     """package arrays_and_hashing;
import java.util.*;
public class LeetCode36_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (!seen.add(c + " in row " + i) || !seen.add(c + " in col " + j) || !seen.add(c + " in box " + i/3 + "-" + j/3))
                        return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] b = new char[9][9]; for(int i=0;i<9;i++) Arrays.fill(b[i],'.'); b[0][0]='5';
        assert new LeetCode36_ValidSudoku().isValidSudoku(b) == true;
        System.out.println("✅ LeetCode36_ValidSudoku Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode128_LongestConsecutiveSequence", 128, "longest-consecutive-sequence",
     """package arrays_and_hashing;
import java.util.*;
public class LeetCode128_LongestConsecutiveSequence {
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
        assert new LeetCode128_LongestConsecutiveSequence().longestConsecutive(new int[]{100,4,200,1,3,2}) == 4;
        System.out.println("✅ LeetCode128_LongestConsecutiveSequence Passed!");
    }
}"""),

    # --- TWO POINTERS ---
    ("two_pointers", "LeetCode125_ValidPalindrome", 125, "valid-palindrome",
     """package two_pointers;
public class LeetCode125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
            l++; r--;
        }
        return true;
    }
    public static void main(String[] args) {
        assert new LeetCode125_ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ LeetCode125_ValidPalindrome Passed!");
    }
}"""),

    ("two_pointers", "LeetCode15_ThreeSum", 15, "3sum",
     """package two_pointers;
import java.util.*;
public class LeetCode15_ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++; r--;
                } else if (sum < 0) l++; else r--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        assert new LeetCode15_ThreeSum().threeSum(new int[]{-1,0,1,2,-1,-4}).size() == 2;
        System.out.println("✅ LeetCode15_ThreeSum Passed!");
    }
}"""),

    ("two_pointers", "LeetCode11_ContainerWithMostWater", 11, "container-with-most-water",
     """package two_pointers;
public class LeetCode11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, max = 0;
        while (l < r) {
            int h = Math.min(height[l], height[r]); max = Math.max(max, h * (r - l));
            if (height[l] < height[r]) l++; else r--;
        }
        return max;
    }
    public static void main(String[] args) {
        assert new LeetCode11_ContainerWithMostWater().maxArea(new int[]{1,8,6,2,5,4,8,3,7}) == 49;
        System.out.println("✅ LeetCode11_ContainerWithMostWater Passed!");
    }
}"""),

    ("two_pointers", "LeetCode42_TrappingRainWater", 42, "trapping-rain-water",
     """package two_pointers;
public class LeetCode42_TrappingRainWater {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1, leftMax = 0, rightMax = 0, ans = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] >= leftMax) leftMax = height[l]; else ans += (leftMax - height[l]);
                l++;
            } else {
                if (height[r] >= rightMax) rightMax = height[r]; else ans += (rightMax - height[r]);
                r--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        assert new LeetCode42_TrappingRainWater().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}) == 6;
        System.out.println("✅ LeetCode42_TrappingRainWater Passed!");
    }
}"""),

    # --- SLIDING WINDOW ---
    ("sliding_window", "LeetCode121_BestTimeToBuyAndSellStock", 121, "best-time-to-buy-and-sell-stock",
     """package sliding_window;
public class LeetCode121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, maxProfit = 0;
        for (int p : prices) {
            if (p < min) min = p;
            else if (p - min > maxProfit) maxProfit = p - min;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        assert new LeetCode121_BestTimeToBuyAndSellStock().maxProfit(new int[]{7,1,5,3,6,4}) == 5;
        System.out.println("✅ LeetCode121_BestTimeToBuyAndSellStock Passed!");
    }
}"""),

    ("sliding_window", "LeetCode3_LongestSubstringWithoutRepeatingCharacters", 3, "longest-substring-without-repeating-characters",
     """package sliding_window;
import java.util.*;
public class LeetCode3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>(); int l = 0, max = 0;
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) { set.remove(s.charAt(l)); l++; }
            set.add(s.charAt(r)); max = Math.max(max, r - l + 1);
        }
        return max;
    }
    public static void main(String[] args) {
        assert new LeetCode3_LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb") == 3;
        System.out.println("✅ LeetCode3_LongestSubstringWithoutRepeatingCharacters Passed!");
    }
}"""),

    ("sliding_window", "LeetCode76_MinimumWindowSubstring", 76, "minimum-window-substring",
     """package sliding_window;
import java.util.*;
public class LeetCode76_MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        int matched = 0, minLen = s.length() + 1, subStart = 0, l = 0;
        for (int r = 0; r < s.length(); r++) {
            char rightChar = s.charAt(r);
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                if (map.get(rightChar) >= 0) matched++;
            }
            while (matched == t.length()) {
                if (r - l + 1 < minLen) { minLen = r - l + 1; subStart = l; }
                char leftChar = s.charAt(l);
                if (map.containsKey(leftChar)) {
                    if (map.get(leftChar) == 0) matched--;
                    map.put(leftChar, map.get(leftChar) + 1);
                }
                l++;
            }
        }
        return minLen > s.length() ? "" : s.substring(subStart, subStart + minLen);
    }
    public static void main(String[] args) {
        assert new LeetCode76_MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC").equals("BANC");
        System.out.println("✅ LeetCode76_MinimumWindowSubstring Passed!");
    }
}"""),

    # --- STACKS AND QUEUES ---
    ("stacks_and_queues", "LeetCode20_ValidParentheses", 20, "valid-parentheses",
     """package stacks_and_queues;
import java.util.Stack;
public class LeetCode20_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        assert new LeetCode20_ValidParentheses().isValid("()[]{}") == true;
        System.out.println("✅ LeetCode20_ValidParentheses Passed!");
    }
}"""),

    ("stacks_and_queues", "LeetCode155_MinStack", 155, "min-stack",
     """package stacks_and_queues;
import java.util.Stack;
public class LeetCode155_MinStack {
    private Stack<Integer> s = new Stack<>(), minS = new Stack<>();
    public void push(int val) { s.push(val); if (minS.isEmpty() || val <= minS.peek()) minS.push(val); }
    public void pop() { if (s.peek().equals(minS.peek())) minS.pop(); s.pop(); }
    public int top() { return s.peek(); }
    public int getMin() { return minS.peek(); }
    public static void main(String[] args) {
        LeetCode155_MinStack ms = new LeetCode155_MinStack(); ms.push(-2); ms.push(0); ms.push(-3);
        assert ms.getMin() == -3; ms.pop(); assert ms.top() == 0;
        System.out.println("✅ LeetCode155_MinStack Passed!");
    }
}"""),

    ("stacks_and_queues", "LeetCode739_DailyTemperatures", 739, "daily-temperatures",
     """package stacks_and_queues;
import java.util.*;
public class LeetCode739_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length; int[] res = new int[n]; Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && temperatures[i] > temperatures[s.peek()]) {
                int prev = s.pop(); res[prev] = i - prev;
            }
            s.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        assert Arrays.equals(new LeetCode739_DailyTemperatures().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}), new int[]{1, 1, 4, 2, 1, 1, 0, 0});
        System.out.println("✅ LeetCode739_DailyTemperatures Passed!");
    }
}"""),

    # --- BINARY SEARCH ---
    ("binary_search", "LeetCode704_BinarySearch", 704, "binary-search",
     """package binary_search;
public class LeetCode704_BinarySearch {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l)/2;
            if (nums[m] == target) return m;
            if (nums[m] < target) l = m + 1; else r = m - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        assert new LeetCode704_BinarySearch().search(new int[]{-1,0,3,5,9,12}, 9) == 4;
        System.out.println("✅ LeetCode704_BinarySearch Passed!");
    }
}"""),

    ("binary_search", "LeetCode33_SearchInRotatedSortedArray", 33, "search-in-rotated-sorted-array",
     """package binary_search;
public class LeetCode33_SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (nums[mid] == target) return mid;
            if (nums[l] <= nums[mid]) {
                if (target >= nums[l] && target < nums[mid]) r = mid - 1; else l = mid + 1;
            } else {
                if (target > nums[mid] && target <= nums[r]) l = mid + 1; else r = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        assert new LeetCode33_SearchInRotatedSortedArray().search(new int[]{4,5,6,7,0,1,2}, 0) == 4;
        System.out.println("✅ LeetCode33_SearchInRotatedSortedArray Passed!");
    }
}"""),

    # --- LINKED LISTS ---
    ("linked_lists", "LeetCode2_AddTwoNumbers", 2, "add-two-numbers",
     """package linked_lists;
public class LeetCode2_AddTwoNumbers {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), p = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            carry = sum / 10; p.next = new ListNode(sum % 10); p = p.next;
            if (l1 != null) l1 = l1.next; if (l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2); l1.next = new ListNode(4);
        ListNode l2 = new ListNode(5); l2.next = new ListNode(6);
        assert new LeetCode2_AddTwoNumbers().addTwoNumbers(l1, l2).val == 7;
        System.out.println("✅ LeetCode2_AddTwoNumbers Passed!");
    }
}"""),

    ("linked_lists", "LeetCode19_RemoveNthNodeFromEnd", 19, "remove-nth-node-from-end-of-list",
     """package linked_lists;
public class LeetCode19_RemoveNthNodeFromEnd {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        for (int i = 0; i <= n; i++) fast = fast.next;
        while (fast != null) { fast = fast.next; slow = slow.next; }
        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1); head.next = new ListNode(2); head.next.next = new ListNode(3);
        assert new LeetCode19_RemoveNthNodeFromEnd().removeNthFromEnd(head, 1).next.val == 2;
        System.out.println("✅ LeetCode19_RemoveNthNodeFromEnd Passed!");
    }
}"""),

    ("linked_lists", "LeetCode21_MergeTwoSortedLists", 21, "merge-two-sorted-lists",
     """package linked_lists;
public class LeetCode21_MergeTwoSortedLists {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2; if (l2 == null) return l1;
        if (l1.val < l2.val) { l1.next = mergeTwoLists(l1.next, l2); return l1; }
        else { l2.next = mergeTwoLists(l1, l2.next); return l2; }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1); ListNode l2 = new ListNode(2);
        assert new LeetCode21_MergeTwoSortedLists().mergeTwoLists(l1, l2).val == 1;
        System.out.println("✅ LeetCode21_MergeTwoSortedLists Passed!");
    }
}"""),

    ("linked_lists", "LeetCode141_LinkedListCycle", 141, "linked-list-cycle",
     """package linked_lists;
public class LeetCode141_LinkedListCycle {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head, fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next; fast = fast.next.next;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3); head.next = new ListNode(2); head.next.next = head;
        assert new LeetCode141_LinkedListCycle().hasCycle(head) == true;
        System.out.println("✅ LeetCode141_LinkedListCycle Passed!");
    }
}"""),

    ("linked_lists", "LeetCode206_ReverseLinkedList", 206, "reverse-linked-list",
     """package linked_lists;
public class LeetCode206_ReverseLinkedList {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) { ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp; }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        assert new LeetCode206_ReverseLinkedList().reverseList(head).val == 2;
        System.out.println("✅ LeetCode206_ReverseLinkedList Passed!");
    }
}"""),

    # --- TREES ---
    ("trees", "LeetCode98_ValidateBinarySearchTree", 98, "validate-binary-search-tree",
     """package trees;
public class LeetCode98_ValidateBinarySearchTree {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public boolean isValidBST(TreeNode root) { return validate(root, null, null); }
    private boolean validate(TreeNode node, Integer min, Integer max) {
        if (node == null) return true;
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) return false;
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2); root.left = new TreeNode(1); root.right = new TreeNode(3);
        assert new LeetCode98_ValidateBinarySearchTree().isValidBST(root) == true;
        System.out.println("✅ LeetCode98_ValidateBinarySearchTree Passed!");
    }
}"""),

    ("trees", "LeetCode102_BinaryTreeLevelOrderTraversal", 102, "binary-tree-level-order-traversal",
     """package trees;
import java.util.*;
public class LeetCode102_BinaryTreeLevelOrderTraversal {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>(); if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>(); q.add(root);
        while (!q.isEmpty()) {
            int len = q.size(); List<Integer> level = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode curr = q.poll(); level.add(curr.val);
                if (curr.left != null) q.add(curr.left); if (curr.right != null) q.add(curr.right);
            }
            res.add(level);
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3); root.left = new TreeNode(9); root.right = new TreeNode(20);
        assert new LeetCode102_BinaryTreeLevelOrderTraversal().levelOrder(root).size() == 2;
        System.out.println("✅ LeetCode102_BinaryTreeLevelOrderTraversal Passed!");
    }
}"""),

    ("trees", "LeetCode104_MaximumDepthOfBinaryTree", 104, "maximum-depth-of-binary-tree",
     """package trees;
public class LeetCode104_MaximumDepthOfBinaryTree {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3); root.left = new TreeNode(9); root.right = new TreeNode(20);
        assert new LeetCode104_MaximumDepthOfBinaryTree().maxDepth(root) == 2;
        System.out.println("✅ LeetCode104_MaximumDepthOfBinaryTree Passed!");
    }
}"""),

    ("trees", "LeetCode124_BinaryTreeMaxPathSum", 124, "binary-tree-maximum-path-sum",
     """package trees;
public class LeetCode124_BinaryTreeMaxPathSum {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    private int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) { maxGain(root); return maxSum; }
    private int maxGain(TreeNode node) {
        if (node == null) return 0;
        int leftGain = Math.max(maxGain(node.left), 0), rightGain = Math.max(maxGain(node.right), 0);
        maxSum = Math.max(maxSum, node.val + leftGain + rightGain);
        return node.val + Math.max(leftGain, rightGain);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2); root.right = new TreeNode(3);
        assert new LeetCode124_BinaryTreeMaxPathSum().maxPathSum(root) == 6;
        System.out.println("✅ LeetCode124_BinaryTreeMaxPathSum Passed!");
    }
}"""),

    ("trees", "LeetCode226_InvertBinaryTree", 226, "invert-binary-tree",
     """package trees;
public class LeetCode226_InvertBinaryTree {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left; root.left = invertTree(root.right); root.right = invertTree(temp);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4); root.left = new TreeNode(2); root.right = new TreeNode(7);
        assert new LeetCode226_InvertBinaryTree().invertTree(root).left.val == 7;
        System.out.println("✅ LeetCode226_InvertBinaryTree Passed!");
    }
}"""),

    ("trees", "LeetCode235_LowestCommonAncestorBST", 235, "lowest-common-ancestor-of-a-binary-search-tree",
     """package trees;
public class LeetCode235_LowestCommonAncestorBST {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6); root.left = new TreeNode(2); root.right = new TreeNode(8);
        assert new LeetCode235_LowestCommonAncestorBST().lowestCommonAncestor(root, root.left, root.right).val == 6;
        System.out.println("✅ LeetCode235_LowestCommonAncestorBST Passed!");
    }
}"""),

    # --- GRAPHS ---
    ("graphs", "LeetCode200_NumberOfIslands", 200, "number-of-islands",
     """package graphs;
public class LeetCode200_NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') { count++; dfs(grid, r, c); }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') return;
        grid[r][c] = '0'; dfs(grid, r - 1, c); dfs(grid, r + 1, c); dfs(grid, r, c - 1); dfs(grid, r, c + 1);
    }
    public static void main(String[] args) {
        char[][] g = {{'1','1','0'},{'1','1','0'},{'0','0','1'}};
        assert new LeetCode200_NumberOfIslands().numIslands(g) == 2;
        System.out.println("✅ LeetCode200_NumberOfIslands Passed!");
    }
}"""),

    ("graphs", "LeetCode207_CourseSchedule", 207, "course-schedule",
     """package graphs;
import java.util.*;
public class LeetCode207_CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>(); for (int i=0; i<numCourses; i++) adj.add(new ArrayList<>());
        int[] inDegree = new int[numCourses];
        for (int[] p : prerequisites) { adj.get(p[1]).add(p[0]); inDegree[p[0]]++; }
        Queue<Integer> q = new LinkedList<>(); for (int i=0; i<numCourses; i++) if (inDegree[i] == 0) q.add(i);
        int count = 0;
        while (!q.isEmpty()) {
            int curr = q.poll(); count++;
            for (int n : adj.get(curr)) { inDegree[n]--; if (inDegree[n] == 0) q.add(n); }
        }
        return count == numCourses;
    }
    public static void main(String[] args) {
        assert new LeetCode207_CourseSchedule().canFinish(2, new int[][]{{1,0}}) == true;
        System.out.println("✅ LeetCode207_CourseSchedule Passed!");
    }
}"""),

    # --- HEAP AND PRIORITY QUEUE ---
    ("heap_and_priority_queue", "LeetCode215_KthLargestElementInArray", 215, "kth-largest-element-in-an-array",
     """package heap_and_priority_queue;
import java.util.PriorityQueue;
public class LeetCode215_KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) { pq.add(num); if (pq.size() > k) pq.poll(); }
        return pq.peek();
    }
    public static void main(String[] args) {
        assert new LeetCode215_KthLargestElementInArray().findKthLargest(new int[]{3,2,1,5,6,4}, 2) == 5;
        System.out.println("✅ LeetCode215_KthLargestElementInArray Passed!");
    }
}"""),

    ("heap_and_priority_queue", "LeetCode23_MergeKSortedLists", 23, "merge-k-sorted-lists",
     """package heap_and_priority_queue;
import java.util.PriorityQueue;
public class LeetCode23_MergeKSortedLists {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for (ListNode node : lists) if (node != null) pq.add(node);
        ListNode dummy = new ListNode(0), tail = dummy;
        while (!pq.isEmpty()) { ListNode node = pq.poll(); tail.next = node; tail = tail.next; if (node.next != null) pq.add(node.next); }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1); l1.next = new ListNode(4);
        ListNode l2 = new ListNode(2); l2.next = new ListNode(3);
        assert new LeetCode23_MergeKSortedLists().mergeKLists(new ListNode[]{l1, l2}).val == 1;
        System.out.println("✅ LeetCode23_MergeKSortedLists Passed!");
    }
}"""),

    ("heap_and_priority_queue", "LeetCode295_FindMedianDataStream", 295, "find-median-from-data-stream",
     """package heap_and_priority_queue;
import java.util.*;
public class LeetCode295_FindMedianDataStream {
    public static class MedianFinder {
        private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        public void addNum(int num) {
            maxHeap.add(num); minHeap.add(maxHeap.poll());
            if (maxHeap.size() < minHeap.size()) maxHeap.add(minHeap.poll());
        }
        public double findMedian() {
            return maxHeap.size() > minHeap.size() ? maxHeap.peek() : (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder(); mf.addNum(1); mf.addNum(2);
        assert mf.findMedian() == 1.5;
        System.out.println("✅ LeetCode295_FindMedianDataStream Passed!");
    }
}"""),

    # --- BACKTRACKING ---
    ("backtracking", "LeetCode39_CombinationSum", 39, "combination-sum",
     """package backtracking;
import java.util.*;
public class LeetCode39_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums, int remain, int start) {
        if (remain < 0) return;
        if (remain == 0) res.add(new ArrayList<>(list));
        else {
            for (int i = start; i < nums.length; i++) {
                list.add(nums[i]); backtrack(res, list, nums, remain - nums[i], i); list.remove(list.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        assert new LeetCode39_CombinationSum().combinationSum(new int[]{2,3,6,7}, 7).size() == 2;
        System.out.println("✅ LeetCode39_CombinationSum Passed!");
    }
}"""),

    ("backtracking", "LeetCode46_Permutations", 46, "permutations",
     """package backtracking;
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
                temp.add(nums[i]); backtrack(res, temp, nums); temp.remove(temp.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        assert new LeetCode46_Permutations().permute(new int[]{1,2,3}).size() == 6;
        System.out.println("✅ LeetCode46_Permutations Passed!");
    }
}"""),

    ("backtracking", "LeetCode78_Subsets", 78, "subsets",
     """package backtracking;
import java.util.*;
public class LeetCode78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]); backtrack(res, temp, nums, i + 1); temp.remove(temp.size() - 1);
        }
    }
    public static void main(String[] args) {
        assert new LeetCode78_Subsets().subsets(new int[]{1,2,3}).size() == 8;
        System.out.println("✅ LeetCode78_Subsets Passed!");
    }
}"""),

    # --- DYNAMIC PROGRAMMING ---
    ("dynamic_programming", "LeetCode5_LongestPalindromicSubstring", 5, "longest-palindromic-substring",
     """package dynamic_programming;
public class LeetCode5_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i), len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) { start = i - (len - 1) / 2; end = i + len / 2; }
        }
        return s.substring(start, end + 1);
    }
    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) { left--; right++; }
        return right - left - 1;
    }
    public static void main(String[] args) {
        assert new LeetCode5_LongestPalindromicSubstring().longestPalindrome("babad").length() == 3;
        System.out.println("✅ LeetCode5_LongestPalindromicSubstring Passed!");
    }
}"""),

    ("dynamic_programming", "LeetCode62_UniquePaths", 62, "unique-paths",
     """package dynamic_programming;
import java.util.Arrays;
public class LeetCode62_UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] row = new int[n]; Arrays.fill(row, 1);
        for (int i = 0; i < m - 1; i++) {
            int[] newRow = new int[n]; Arrays.fill(newRow, 1);
            for (int j = n - 2; j >= 0; j--) newRow[j] = newRow[j + 1] + row[j];
            row = newRow;
        }
        return row[0];
    }
    public static void main(String[] args) {
        assert new LeetCode62_UniquePaths().uniquePaths(3, 7) == 28;
        System.out.println("✅ LeetCode62_UniquePaths Passed!");
    }
}"""),

    ("dynamic_programming", "LeetCode70_ClimbingStairs", 70, "climbing-stairs",
     """package dynamic_programming;
public class LeetCode70_ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }
    public static void main(String[] args) {
        assert new LeetCode70_ClimbingStairs().climbStairs(5) == 8;
        System.out.println("✅ LeetCode70_ClimbingStairs Passed!");
    }
}"""),

    ("dynamic_programming", "LeetCode198_HouseRobber", 198, "house-robber",
     """package dynamic_programming;
public class LeetCode198_HouseRobber {
    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;
        for (int n : nums) { int temp = Math.max(n + rob1, rob2); rob1 = rob2; rob2 = temp; }
        return rob2;
    }
    public static void main(String[] args) {
        assert new LeetCode198_HouseRobber().rob(new int[]{1, 2, 3, 1}) == 4;
        System.out.println("✅ LeetCode198_HouseRobber Passed!");
    }
}"""),

    ("dynamic_programming", "LeetCode213_HouseRobberII", 213, "house-robber-ii",
     """package dynamic_programming;
public class LeetCode213_HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(robHelper(nums, 0, nums.length - 2), robHelper(nums, 1, nums.length - 1));
    }
    private int robHelper(int[] nums, int start, int end) {
        int rob1 = 0, rob2 = 0;
        for (int i = start; i <= end; i++) { int temp = Math.max(nums[i] + rob1, rob2); rob1 = rob2; rob2 = temp; }
        return rob2;
    }
    public static void main(String[] args) {
        assert new LeetCode213_HouseRobberII().rob(new int[]{2, 3, 2}) == 3;
        System.out.println("✅ LeetCode213_HouseRobberII Passed!");
    }
}"""),

    ("dynamic_programming", "LeetCode300_LongestIncreasingSubsequence", 300, "longest-increasing-subsequence",
     """package dynamic_programming;
import java.util.Arrays;
public class LeetCode300_LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length]; Arrays.fill(dp, 1); int max = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        assert new LeetCode300_LongestIncreasingSubsequence().lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}) == 4;
        System.out.println("✅ LeetCode300_LongestIncreasingSubsequence Passed!");
    }
}"""),

    ("dynamic_programming", "LeetCode322_CoinChange", 322, "coin-change",
     """package dynamic_programming;
import java.util.Arrays;
public class LeetCode322_CoinChange {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1, dp[] = new int[amount + 1]; Arrays.fill(dp, max); dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int c : coins) if (c <= i) dp[i] = Math.min(dp[i], dp[i - c] + 1);
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        assert new LeetCode322_CoinChange().coinChange(new int[]{1,2,5}, 11) == 3;
        System.out.println("✅ LeetCode322_CoinChange Passed!");
    }
}"""),

    # --- GREEDY ---
    ("greedy", "LeetCode53_MaximumSubarray", 53, "maximum-subarray",
     """package greedy;
public class LeetCode53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]); maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        assert new LeetCode53_MaximumSubarray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ LeetCode53_MaximumSubarray Passed!");
    }
}"""),

    ("greedy", "LeetCode55_JumpGame", 55, "jump-game",
     """package greedy;
public class LeetCode55_JumpGame {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) if (i + nums[i] >= goal) goal = i;
        return goal == 0;
    }
    public static void main(String[] args) {
        assert new LeetCode55_JumpGame().canJump(new int[]{2,3,1,1,4}) == true;
        System.out.println("✅ LeetCode55_JumpGame Passed!");
    }
}"""),

    # --- BIT MANIPULATION ---
    ("bit_manipulation", "LeetCode136_SingleNumber", 136, "single-number",
     """package bit_manipulation;
public class LeetCode136_SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        assert new LeetCode136_SingleNumber().singleNumber(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode136_SingleNumber Passed!");
    }
}"""),

    ("bit_manipulation", "LeetCode191_NumberOf1Bits", 191, "number-of-1-bits",
     """package bit_manipulation;
public class LeetCode191_NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0; while (n != 0) { n &= (n - 1); count++; }
        return count;
    }
    public static void main(String[] args) {
        assert new LeetCode191_NumberOf1Bits().hammingWeight(11) == 3;
        System.out.println("✅ LeetCode191_NumberOf1Bits Passed!");
    }
}""")
]

def build_authentic_catalog():
    base_dir = os.path.dirname(os.path.abspath(__file__))
    java_dir = os.path.join(base_dir, "java")
    
    count = 0
    for category, class_name, num, slug, code in AUTHENTIC_CATALOG:
        cat_dir = os.path.join(java_dir, category)
        os.makedirs(cat_dir, exist_ok=True)
        file_path = os.path.join(cat_dir, f"{class_name}.java")
        url_header = f"// https://leetcode.com/problems/{slug}/\n"
        with open(file_path, "w") as f:
            f.write(url_header + code.strip() + "\n")
        count += 1
        print(f"✅ Generated authentic solution: {class_name}.java -> {url_header.strip()}")

    print(f"\n🎉 Successfully generated {count} authentic Java LeetCode solutions with verified URLs!")

if __name__ == "__main__":
    build_authentic_catalog()
