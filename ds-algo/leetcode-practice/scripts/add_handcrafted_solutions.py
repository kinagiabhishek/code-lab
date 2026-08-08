#!/usr/bin/env python3
import os

HANDCRAFTED = [
    ("arrays_and_hashing", "RemoveDuplicatesFromSortedArray", 26, "remove-duplicates-from-sorted-array",
     """public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { i++; nums[i] = nums[j]; }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solver = new RemoveDuplicatesFromSortedArray();
        assert solver.removeDuplicates(new int[]{1,1,2}) == 2;
        System.out.println("✅ RemoveDuplicatesFromSortedArray Passed!");
    }"""),

    ("two_pointers", "RemoveElement", 27, "remove-element",
     """public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { nums[k] = nums[i]; k++; }
        }
        return k;
    }
    public static void main(String[] args) {
        RemoveElement solver = new RemoveElement();
        assert solver.removeElement(new int[]{3,2,2,3}, 3) == 2;
        System.out.println("✅ RemoveElement Passed!");
    }"""),

    ("binary_search", "SearchInsertPosition", 35, "search-insert-position",
     """public int searchInsert(int[] nums, int target) {
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
    }"""),

    ("bit_manipulation", "AddBinary", 67, "add-binary",
     """public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        AddBinary solver = new AddBinary();
        assert solver.addBinary("11", "1").equals("100");
        System.out.println("✅ AddBinary Passed!");
    }"""),

    ("binary_search", "Sqrtx", 69, "sqrtx",
     """public int mySqrt(int x) {
        if (x == 0) return 0;
        int l = 1, r = x, res = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid <= x / mid) { res = mid; l = mid + 1; }
            else r = mid - 1;
        }
        return res;
    }
    public static void main(String[] args) {
        Sqrtx solver = new Sqrtx();
        assert solver.mySqrt(4) == 2;
        System.out.println("✅ Sqrtx Passed!");
    }"""),

    ("dynamic_programming", "ClimbingStairs", 70, "climbing-stairs",
     """public int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }
    public static void main(String[] args) {
        ClimbingStairs solver = new ClimbingStairs();
        assert solver.climbStairs(3) == 3;
        System.out.println("✅ ClimbingStairs Passed!");
    }"""),

    ("linked_lists", "RemoveDuplicatesFromSortedList", 83, "remove-duplicates-from-sorted-list",
     """public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) current.next = current.next.next;
            else current = current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList solver = new RemoveDuplicatesFromSortedList();
        ListNode head = new ListNode(1); head.next = new ListNode(1); head.next.next = new ListNode(2);
        ListNode res = solver.deleteDuplicates(head);
        assert res.val == 1 && res.next.val == 2;
        System.out.println("✅ RemoveDuplicatesFromSortedList Passed!");
    }"""),

    ("trees", "BinaryTreeInorderTraversal", 94, "binary-tree-inorder-traversal",
     """public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    private void helper(TreeNode node, List<Integer> res) {
        if (node == null) return;
        helper(node.left, res);
        res.add(node.val);
        helper(node.right, res);
    }
    public static void main(String[] args) {
        BinaryTreeInorderTraversal solver = new BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(1); root.right = new TreeNode(2); root.right.left = new TreeNode(3);
        assert solver.inorderTraversal(root).equals(Arrays.asList(1, 3, 2));
        System.out.println("✅ BinaryTreeInorderTraversal Passed!");
    }"""),

    ("trees", "SymmetricTree", 101, "symmetric-tree",
     """public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public boolean isSymmetric(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
    }
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right);
    }
    public static void main(String[] args) {
        SymmetricTree solver = new SymmetricTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2); root.right = new TreeNode(2);
        assert solver.isSymmetric(root) == true;
        System.out.println("✅ SymmetricTree Passed!");
    }"""),

    ("trees", "MaximumDepthOfBinaryTree", 104, "maximum-depth-of-binary-tree",
     """public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static void main(String[] args) {
        MaximumDepthOfBinaryTree solver = new MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(3); root.left = new TreeNode(9); root.right = new TreeNode(20);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ MaximumDepthOfBinaryTree Passed!");
    }"""),

    ("linked_lists", "ReverseLinkedList", 206, "reverse-linked-list",
     """public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    public static void main(String[] args) {
        ReverseLinkedList solver = new ReverseLinkedList();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2 && res.next.val == 1;
        System.out.println("✅ ReverseLinkedList Passed!");
    }"""),

    ("bit_manipulation", "SingleNumber", 136, "single-number",
     """public int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) res ^= n;
        return res;
    }
    public static void main(String[] args) {
        SingleNumber solver = new SingleNumber();
        assert solver.singleNumber(new int[]{2,2,1}) == 1;
        System.out.println("✅ SingleNumber Passed!");
    }""")
]

def generate():
    base_dir = os.path.dirname(os.path.abspath(__file__))
    leetcode_dir = os.path.dirname(base_dir)
    java_dir = os.path.join(leetcode_dir, "java")
    
    count = 0
    for cat, class_name, num, slug, code_body in HANDCRAFTED:
        cat_dir = os.path.join(java_dir, cat)
        os.makedirs(cat_dir, exist_ok=True)
        file_path = os.path.join(cat_dir, f"{class_name}.java")
        url_header = f"// https://leetcode.com/problems/{slug}/\n"
        
        full_code = f"""{url_header}package {cat};

import java.util.*;

public class {class_name} {{
{code_body.rstrip()}
}}
"""
        with open(file_path, "w", encoding="utf-8") as f:
            f.write(full_code)
        count += 1
        print(f"✅ Created handcrafted solution: {class_name}.java")

    print(f"\n🎉 Successfully created {count} handcrafted working solution files!")

if __name__ == "__main__":
    generate()
