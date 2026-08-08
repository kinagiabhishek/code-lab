#!/usr/bin/env python3
import os

# Comprehensive suite of Java LeetCode solutions across all Core Data Structures & Algorithm Domains
PROBLEMS = [
    # 1. Arrays & Hashing
    ("arrays_and_hashing", "LeetCode217_ContainsDuplicate", 217, "Contains Duplicate", "Easy", "https://leetcode.com/problems/contains-duplicate/",
     """package arrays_and_hashing;
import java.util.HashSet;
import java.util.Set;

public class LeetCode217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        LeetCode217_ContainsDuplicate solver = new LeetCode217_ContainsDuplicate();
        assert solver.containsDuplicate(new int[]{1, 2, 3, 1}) == true;
        assert solver.containsDuplicate(new int[]{1, 2, 3, 4}) == false;
        System.out.println("✅ LeetCode217_ContainsDuplicate Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode242_ValidAnagram", 242, "Valid Anagram", "Easy", "https://leetcode.com/problems/valid-anagram/",
     """package arrays_and_hashing;

public class LeetCode242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int count : counts) {
            if (count != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        LeetCode242_ValidAnagram solver = new LeetCode242_ValidAnagram();
        assert solver.isAnagram("anagram", "nagaram") == true;
        assert solver.isAnagram("rat", "car") == false;
        System.out.println("✅ LeetCode242_ValidAnagram Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode49_GroupAnagrams", 49, "Group Anagrams", "Medium", "https://leetcode.com/problems/group-anagrams/",
     """package arrays_and_hashing;
import java.util.*;

public class LeetCode49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        LeetCode49_GroupAnagrams solver = new LeetCode49_GroupAnagrams();
        List<List<String>> res = solver.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        assert res.size() == 3;
        System.out.println("✅ LeetCode49_GroupAnagrams Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode347_TopKFrequentElements", 347, "Top K Frequent Elements", "Medium", "https://leetcode.com/problems/top-k-frequent-elements/",
     """package arrays_and_hashing;
import java.util.*;

public class LeetCode347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> countMap.get(a) - countMap.get(b));
        for (int num : countMap.keySet()) {
            pq.add(num);
            if (pq.size() > k) pq.poll();
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = pq.poll();
        return res;
    }
    public static void main(String[] args) {
        LeetCode347_TopKFrequentElements solver = new LeetCode347_TopKFrequentElements();
        int[] res = solver.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
        assert res.length == 2;
        System.out.println("✅ LeetCode347_TopKFrequentElements Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode238_ProductOfArrayExceptSelf", 238, "Product of Array Except Self", "Medium", "https://leetcode.com/problems/product-of-array-except-self/",
     """package arrays_and_hashing;
import java.util.Arrays;

public class LeetCode238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) res[i] = res[i - 1] * nums[i - 1];
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        LeetCode238_ProductOfArrayExceptSelf solver = new LeetCode238_ProductOfArrayExceptSelf();
        int[] res = solver.productExceptSelf(new int[]{1, 2, 3, 4});
        assert Arrays.equals(res, new int[]{24, 12, 8, 6});
        System.out.println("✅ LeetCode238_ProductOfArrayExceptSelf Passed!");
    }
}"""),

    # 2. Two Pointers
    ("two_pointers", "LeetCode125_ValidPalindrome", 125, "Valid Palindrome", "Easy", "https://leetcode.com/problems/valid-palindrome/",
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
        LeetCode125_ValidPalindrome solver = new LeetCode125_ValidPalindrome();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ LeetCode125_ValidPalindrome Passed!");
    }
}"""),

    ("two_pointers", "LeetCode11_ContainerWithMostWater", 11, "Container With Most Water", "Medium", "https://leetcode.com/problems/container-with-most-water/",
     """package two_pointers;

public class LeetCode11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, max = 0;
        while (l < r) {
            int h = Math.min(height[l], height[r]);
            max = Math.max(max, h * (r - l));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return max;
    }
    public static void main(String[] args) {
        LeetCode11_ContainerWithMostWater solver = new LeetCode11_ContainerWithMostWater();
        assert solver.maxArea(new int[]{1,8,6,2,5,4,8,3,7}) == 49;
        System.out.println("✅ LeetCode11_ContainerWithMostWater Passed!");
    }
}"""),

    # 3. Sliding Window
    ("sliding_window", "LeetCode3_LongestSubstringWithoutRepeating", 3, "Longest Substring Without Repeating", "Medium", "https://leetcode.com/problems/longest-substring-without-repeating-characters/",
     """package sliding_window;
import java.util.HashSet;
import java.util.Set;

public class LeetCode3_LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0, maxLen = 0;
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        LeetCode3_LongestSubstringWithoutRepeating solver = new LeetCode3_LongestSubstringWithoutRepeating();
        assert solver.lengthOfLongestSubstring("abcabcbb") == 3;
        System.out.println("✅ LeetCode3_LongestSubstringWithoutRepeating Passed!");
    }
}"""),

    ("sliding_window", "LeetCode76_MinimumWindowSubstring", 76, "Minimum Window Substring", "Hard", "https://leetcode.com/problems/minimum-window-substring/",
     """package sliding_window;
import java.util.HashMap;
import java.util.Map;

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
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    subStart = l;
                }
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
        LeetCode76_MinimumWindowSubstring solver = new LeetCode76_MinimumWindowSubstring();
        assert solver.minWindow("ADOBECODEBANC", "ABC").equals("BANC");
        System.out.println("✅ LeetCode76_MinimumWindowSubstring Passed!");
    }
}"""),

    # 4. Stacks & Queues
    ("stacks_and_queues", "LeetCode20_ValidParentheses", 20, "Valid Parentheses", "Easy", "https://leetcode.com/problems/valid-parentheses/",
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
        LeetCode20_ValidParentheses solver = new LeetCode20_ValidParentheses();
        assert solver.isValid("()[]{}") == true;
        assert solver.isValid("(]") == false;
        System.out.println("✅ LeetCode20_ValidParentheses Passed!");
    }
}"""),

    ("stacks_and_queues", "LeetCode739_DailyTemperatures", 739, "Daily Temperatures", "Medium", "https://leetcode.com/problems/daily-temperatures/",
     """package stacks_and_queues;
import java.util.Stack;
import java.util.Arrays;

public class LeetCode739_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prev = stack.pop();
                res[prev] = i - prev;
            }
            stack.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        LeetCode739_DailyTemperatures solver = new LeetCode739_DailyTemperatures();
        int[] res = solver.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        assert Arrays.equals(res, new int[]{1, 1, 4, 2, 1, 1, 0, 0});
        System.out.println("✅ LeetCode739_DailyTemperatures Passed!");
    }
}"""),

    ("stacks_and_queues", "LeetCode155_MinStack", 155, "Min Stack", "Medium", "https://leetcode.com/problems/min-stack/",
     """package stacks_and_queues;
import java.util.Stack;

public class LeetCode155_MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }
    public int top() { return stack.peek(); }
    public int getMin() { return minStack.peek(); }

    public static void main(String[] args) {
        LeetCode155_MinStack minStack = new LeetCode155_MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assert minStack.getMin() == -3;
        minStack.pop();
        assert minStack.top() == 0;
        assert minStack.getMin() == -2;
        System.out.println("✅ LeetCode155_MinStack Passed!");
    }
}"""),

    # 5. Trees (Binary Trees & BSTs)
    ("trees", "LeetCode226_InvertBinaryTree", 226, "Invert Binary Tree", "Easy", "https://leetcode.com/problems/invert-binary-tree/",
     """package trees;

public class LeetCode226_InvertBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
    public static void main(String[] args) {
        LeetCode226_InvertBinaryTree solver = new LeetCode226_InvertBinaryTree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        TreeNode inverted = solver.invertTree(root);
        assert inverted.left.val == 7;
        assert inverted.right.val == 2;
        System.out.println("✅ LeetCode226_InvertBinaryTree Passed!");
    }
}"""),

    ("trees", "LeetCode104_MaximumDepthOfBinaryTree", 104, "Maximum Depth of Binary Tree", "Easy", "https://leetcode.com/problems/maximum-depth-of-binary-tree/",
     """package trees;

public class LeetCode104_MaximumDepthOfBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static void main(String[] args) {
        LeetCode104_MaximumDepthOfBinaryTree solver = new LeetCode104_MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        assert solver.maxDepth(root) == 3;
        System.out.println("✅ LeetCode104_MaximumDepthOfBinaryTree Passed!");
    }
}"""),

    ("trees", "LeetCode235_LowestCommonAncestorBST", 235, "Lowest Common Ancestor of a BST", "Medium", "https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/",
     """package trees;

public class LeetCode235_LowestCommonAncestorBST {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
    public static void main(String[] args) {
        LeetCode235_LowestCommonAncestorBST solver = new LeetCode235_LowestCommonAncestorBST();
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        TreeNode p = root.left;
        TreeNode q = root.right;
        assert solver.lowestCommonAncestor(root, p, q).val == 6;
        System.out.println("✅ LeetCode235_LowestCommonAncestorBST Passed!");
    }
}"""),

    ("trees", "LeetCode124_BinaryTreeMaxPathSum", 124, "Binary Tree Maximum Path Sum", "Hard", "https://leetcode.com/problems/binary-tree-maximum-path-sum/",
     """package trees;

public class LeetCode124_BinaryTreeMaxPathSum {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    private int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }
    private int maxGain(TreeNode node) {
        if (node == null) return 0;
        int leftGain = Math.max(maxGain(node.left), 0);
        int rightGain = Math.max(maxGain(node.right), 0);
        int priceNewPath = node.val + leftGain + rightGain;
        maxSum = Math.max(maxSum, priceNewPath);
        return node.val + Math.max(leftGain, rightGain);
    }
    public static void main(String[] args) {
        LeetCode124_BinaryTreeMaxPathSum solver = new LeetCode124_BinaryTreeMaxPathSum();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assert solver.maxPathSum(root) == 6;
        System.out.println("✅ LeetCode124_BinaryTreeMaxPathSum Passed!");
    }
}"""),

    # 6. Linked Lists
    ("linked_lists", "LeetCode21_MergeTwoSortedLists", 21, "Merge Two Sorted Lists", "Easy", "https://leetcode.com/problems/merge-two-sorted-lists/",
     """package linked_lists;

public class LeetCode21_MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
    public static void main(String[] args) {
        LeetCode21_MergeTwoSortedLists solver = new LeetCode21_MergeTwoSortedLists();
        ListNode l1 = new ListNode(1); l1.next = new ListNode(2); l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1); l2.next = new ListNode(3); l2.next.next = new ListNode(4);
        ListNode merged = solver.mergeTwoLists(l1, l2);
        assert merged.val == 1;
        System.out.println("✅ LeetCode21_MergeTwoSortedLists Passed!");
    }
}"""),

    ("linked_lists", "LeetCode141_LinkedListCycle", 141, "Linked List Cycle", "Easy", "https://leetcode.com/problems/linked-list-cycle/",
     """package linked_lists;

public class LeetCode141_LinkedListCycle {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head, fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LeetCode141_LinkedListCycle solver = new LeetCode141_LinkedListCycle();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = head.next; // Cycle
        assert solver.hasCycle(head) == true;
        System.out.println("✅ LeetCode141_LinkedListCycle Passed!");
    }
}"""),

    # 7. Graphs
    ("graphs", "LeetCode207_CourseSchedule", 207, "Course Schedule", "Medium", "https://leetcode.com/problems/course-schedule/",
     """package graphs;
import java.util.*;

public class LeetCode207_CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());
        int[] inDegree = new int[numCourses];
        for (int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
            inDegree[p[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) if (inDegree[i] == 0) q.add(i);
        int count = 0;
        while (!q.isEmpty()) {
            int curr = q.poll();
            count++;
            for (int neighbor : adj.get(curr)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) q.add(neighbor);
            }
        }
        return count == numCourses;
    }
    public static void main(String[] args) {
        LeetCode207_CourseSchedule solver = new LeetCode207_CourseSchedule();
        assert solver.canFinish(2, new int[][]{{1, 0}}) == true;
        assert solver.canFinish(2, new int[][]{{1, 0}, {0, 1}}) == false;
        System.out.println("✅ LeetCode207_CourseSchedule Passed!");
    }
}"""),

    # 8. Heap & Priority Queue
    ("heap_and_priority_queue", "LeetCode215_KthLargestElementInArray", 215, "Kth Largest Element in an Array", "Medium", "https://leetcode.com/problems/kth-largest-element-in-an-array/",
     """package heap_and_priority_queue;
import java.util.PriorityQueue;

public class LeetCode215_KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        LeetCode215_KthLargestElementInArray solver = new LeetCode215_KthLargestElementInArray();
        assert solver.findKthLargest(new int[]{3,2,1,5,6,4}, 2) == 5;
        System.out.println("✅ LeetCode215_KthLargestElementInArray Passed!");
    }
}"""),

    # 9. Backtracking
    ("backtracking", "LeetCode78_Subsets", 78, "Subsets", "Medium", "https://leetcode.com/problems/subsets/",
     """package backtracking;
import java.util.*;

public class LeetCode78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
    public static void main(String[] args) {
        LeetCode78_Subsets solver = new LeetCode78_Subsets();
        List<List<Integer>> res = solver.subsets(new int[]{1, 2, 3});
        assert res.size() == 8;
        System.out.println("✅ LeetCode78_Subsets Passed!");
    }
}"""),

    # 10. Greedy
    ("greedy", "LeetCode53_MaximumSubarray", 53, "Maximum Subarray", "Medium", "https://leetcode.com/problems/maximum-subarray/",
     """package greedy;

public class LeetCode53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        LeetCode53_MaximumSubarray solver = new LeetCode53_MaximumSubarray();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ LeetCode53_MaximumSubarray Passed!");
    }
}"""),

    # 11. Bit Manipulation
    ("bit_manipulation", "LeetCode136_SingleNumber", 136, "Single Number", "Easy", "https://leetcode.com/problems/single-number/",
     """package bit_manipulation;

public class LeetCode136_SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) res ^= num;
        return res;
    }
    public static void main(String[] args) {
        LeetCode136_SingleNumber solver = new LeetCode136_SingleNumber();
        assert solver.singleNumber(new int[]{2, 2, 1}) == 1;
        assert solver.singleNumber(new int[]{4, 1, 2, 1, 2}) == 4;
        System.out.println("✅ LeetCode136_SingleNumber Passed!");
    }
}""")
]

def generate_all():
    base_dir = os.path.dirname(os.path.abspath(__file__))
    java_dir = os.path.join(base_dir, "java")
    
    generated_files = []
    
    for category, class_name, num, title, diff, link, code in PROBLEMS:
        cat_dir = os.path.join(java_dir, category)
        os.makedirs(cat_dir, exist_ok=True)
        file_path = os.path.join(cat_dir, f"{class_name}.java")
        
        with open(file_path, "w") as f:
            f.write(code.strip() + "\n")
            
        generated_files.append((category, class_name, num, title, diff, link, file_path))
        print(f"✨ Created: java/{category}/{class_name}.java [{diff}]")

    print(f"\n🎉 Successfully generated {len(generated_files)} Java LeetCode problem solutions across core DS & Algorithms!")
    return generated_files

if __name__ == "__main__":
    generate_all()
