#!/usr/bin/env python3
import os

TEMPLATES = [
    # (Category, ClassName, Num, Title, Difficulty, ImplementationCode)
    ("arrays_and_hashing", "LeetCode14_LongestCommonPrefix", 14, "Longest Common Prefix", "Easy",
     """package arrays_and_hashing;
public class LeetCode14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        assert new LeetCode14_LongestCommonPrefix().longestCommonPrefix(new String[]{"flower","flow","flight"}).equals("fl");
        System.out.println("✅ LeetCode14_LongestCommonPrefix Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode271_EncodeAndDecodeStrings", 271, "Encode and Decode Strings", "Medium",
     """package arrays_and_hashing;
import java.util.*;
public class LeetCode271_EncodeAndDecodeStrings {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) sb.append(s.length()).append('#').append(s);
        return sb.toString();
    }
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int slash = s.indexOf('#', i);
            int len = Integer.parseInt(s.substring(i, slash));
            i = slash + 1 + len;
            res.add(s.substring(slash + 1, i));
        }
        return res;
    }
    public static void main(String[] args) {
        LeetCode271_EncodeAndDecodeStrings codec = new LeetCode271_EncodeAndDecodeStrings();
        List<String> input = Arrays.asList("lint","code","love","you");
        assert codec.decode(codec.encode(input)).equals(input);
        System.out.println("✅ LeetCode271_EncodeAndDecodeStrings Passed!");
    }
}"""),

    ("linked_lists", "LeetCode2_AddTwoNumbers", 2, "Add Two Numbers", "Medium",
     """package linked_lists;
public class LeetCode2_AddTwoNumbers {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), p = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            carry = sum / 10;
            p.next = new ListNode(sum % 10);
            p = p.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2); l1.next = new ListNode(4); l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5); l2.next = new ListNode(6); l2.next.next = new ListNode(4);
        assert new LeetCode2_AddTwoNumbers().addTwoNumbers(l1, l2).val == 7;
        System.out.println("✅ LeetCode2_AddTwoNumbers Passed!");
    }
}"""),

    ("linked_lists", "LeetCode19_RemoveNthNodeFromEnd", 19, "Remove Nth Node From End of List", "Medium",
     """package linked_lists;
public class LeetCode19_RemoveNthNodeFromEnd {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
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

    ("linked_lists", "LeetCode143_ReorderList", 143, "Reorder List", "Medium",
     """package linked_lists;
public class LeetCode143_ReorderList {
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) { slow = slow.next; fast = fast.next.next; }
        ListNode prev = null, curr = slow.next;
        slow.next = null;
        while (curr != null) { ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp; }
        ListNode p1 = head, p2 = prev;
        while (p2 != null) {
            ListNode t1 = p1.next, t2 = p2.next;
            p1.next = p2; p2.next = t1; p1 = t1; p2 = t2;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1); head.next = new ListNode(2); head.next.next = new ListNode(3); head.next.next.next = new ListNode(4);
        new LeetCode143_ReorderList().reorderList(head);
        assert head.next.val == 4;
        System.out.println("✅ LeetCode143_ReorderList Passed!");
    }
}"""),

    ("trees", "LeetCode98_ValidateBinarySearchTree", 98, "Validate Binary Search Tree", "Medium",
     """package trees;
public class LeetCode98_ValidateBinarySearchTree {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
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

    ("trees", "LeetCode102_BinaryTreeLevelOrderTraversal", 102, "Binary Tree Level Order Traversal", "Medium",
     """package trees;
import java.util.*;
public class LeetCode102_BinaryTreeLevelOrderTraversal {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int len = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode curr = q.poll();
                level.add(curr.val);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
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

    ("trees", "LeetCode572_SubtreeOfAnotherTree", 572, "Subtree of Another Tree", "Easy",
     """package trees;
public class LeetCode572_SubtreeOfAnotherTree {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (isSame(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val) return false;
        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3); root.left = new TreeNode(4); root.right = new TreeNode(5);
        TreeNode sub = new TreeNode(4);
        assert new LeetCode572_SubtreeOfAnotherTree().isSubtree(root, sub) == true;
        System.out.println("✅ LeetCode572_SubtreeOfAnotherTree Passed!");
    }
}"""),

    ("dynamic_programming", "LeetCode198_HouseRobber", 198, "House Robber", "Medium",
     """package dynamic_programming;
public class LeetCode198_HouseRobber {
    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;
        for (int n : nums) {
            int temp = Math.max(n + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
    public static void main(String[] args) {
        assert new LeetCode198_HouseRobber().rob(new int[]{1, 2, 3, 1}) == 4;
        System.out.println("✅ LeetCode198_HouseRobber Passed!");
    }
}"""),

    ("dynamic_programming", "LeetCode213_HouseRobberII", 213, "House Robber II", "Medium",
     """package dynamic_programming;
public class LeetCode213_HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(robHelper(nums, 0, nums.length - 2), robHelper(nums, 1, nums.length - 1));
    }
    private int robHelper(int[] nums, int start, int end) {
        int rob1 = 0, rob2 = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(nums[i] + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
    public static void main(String[] args) {
        assert new LeetCode213_HouseRobberII().rob(new int[]{2, 3, 2}) == 3;
        System.out.println("✅ LeetCode213_HouseRobberII Passed!");
    }
}"""),

    ("dynamic_programming", "LeetCode5_LongestPalindromicSubstring", 5, "Longest Palindromic Substring", "Medium",
     """package dynamic_programming;
public class LeetCode5_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--; right++;
        }
        return right - left - 1;
    }
    public static void main(String[] args) {
        assert new LeetCode5_LongestPalindromicSubstring().longestPalindrome("babad").length() == 3;
        System.out.println("✅ LeetCode5_LongestPalindromicSubstring Passed!");
    }
}"""),

    ("dynamic_programming", "LeetCode62_UniquePaths", 62, "Unique Paths", "Medium",
     """package dynamic_programming;
import java.util.Arrays;
public class LeetCode62_UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] row = new int[n];
        Arrays.fill(row, 1);
        for (int i = 0; i < m - 1; i++) {
            int[] newRow = new int[n];
            Arrays.fill(newRow, 1);
            for (int j = n - 2; j >= 0; j--) {
                newRow[j] = newRow[j + 1] + row[j];
            }
            row = newRow;
        }
        return row[0];
    }
    public static void main(String[] args) {
        assert new LeetCode62_UniquePaths().uniquePaths(3, 7) == 28;
        System.out.println("✅ LeetCode62_UniquePaths Passed!");
    }
}"""),

    ("backtracking", "LeetCode39_CombinationSum", 39, "Combination Sum", "Medium",
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
                list.add(nums[i]);
                backtrack(res, list, nums, remain - nums[i], i);
                list.remove(list.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        assert new LeetCode39_CombinationSum().combinationSum(new int[]{2,3,6,7}, 7).size() == 2;
        System.out.println("✅ LeetCode39_CombinationSum Passed!");
    }
}"""),

    ("backtracking", "LeetCode46_Permutations", 46, "Permutations", "Medium",
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
                temp.add(nums[i]);
                backtrack(res, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        assert new LeetCode46_Permutations().permute(new int[]{1,2,3}).size() == 6;
        System.out.println("✅ LeetCode46_Permutations Passed!");
    }
}"""),

    ("greedy", "LeetCode55_JumpGame", 55, "Jump Game", "Medium",
     """package greedy;
public class LeetCode55_JumpGame {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= goal) goal = i;
        }
        return goal == 0;
    }
    public static void main(String[] args) {
        assert new LeetCode55_JumpGame().canJump(new int[]{2,3,1,1,4}) == true;
        assert new LeetCode55_JumpGame().canJump(new int[]{3,2,1,0,4}) == false;
        System.out.println("✅ LeetCode55_JumpGame Passed!");
    }
}"""),

    ("bit_manipulation", "LeetCode191_NumberOf1Bits", 191, "Number of 1 Bits", "Easy",
     """package bit_manipulation;
public class LeetCode191_NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        assert new LeetCode191_NumberOf1Bits().hammingWeight(11) == 3;
        System.out.println("✅ LeetCode191_NumberOf1Bits Passed!");
    }
}""")
]

def run_expand():
    base_dir = os.path.dirname(os.path.abspath(__file__))
    java_dir = os.path.join(base_dir, "java")
    
    count = 0
    for category, class_name, num, title, diff, code in TEMPLATES:
        cat_dir = os.path.join(java_dir, category)
        os.makedirs(cat_dir, exist_ok=True)
        file_path = os.path.join(cat_dir, f"{class_name}.java")
        with open(file_path, "w") as f:
            f.write(code.strip() + "\n")
        count += 1
        
    print(f"🎉 Expanded catalog with {count} additional Java LeetCode solutions!")

if __name__ == "__main__":
    run_expand()
