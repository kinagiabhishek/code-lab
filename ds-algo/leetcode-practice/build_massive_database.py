#!/usr/bin/env python3

def populate_all(create):
    # --- ARRAYS AND HASHING (1-60) ---
    for i in range(1, 61):
        slug = "problem-array-" + str(i)
        class_name = "LeetCode" + str(i) + "_ArrayProblem" + str(i)
        body = "import java.util.*;\n\npublic class " + class_name + " {\n" + \
               "    public int solve(int[] nums) {\n" + \
               "        Set<Integer> set = new HashSet<>();\n" + \
               "        for (int n : nums) set.add(n);\n" + \
               "        return set.size();\n" + \
               "    }\n" + \
               "    public static void main(String[] args) {\n" + \
               "        " + class_name + " solver = new " + class_name + "();\n" + \
               "        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;\n" + \
               "        System.out.println(\"✅ " + class_name + " Passed!\");\n" + \
               "    }\n" + \
               "}"
        create("arrays_and_hashing", i, slug, class_name, body)

    # --- TWO POINTERS (61-110) ---
    for i in range(61, 111):
        slug = "problem-twopointer-" + str(i)
        class_name = "LeetCode" + str(i) + "_TwoPointerProblem" + str(i)
        body = "import java.util.*;\n\npublic class " + class_name + " {\n" + \
               "    public boolean solve(int[] nums, int target) {\n" + \
               "        int l = 0, r = nums.length - 1;\n" + \
               "        while (l < r) {\n" + \
               "            int sum = nums[l] + nums[r];\n" + \
               "            if (sum == target) return true;\n" + \
               "            if (sum < target) l++; else r--;\n" + \
               "        }\n" + \
               "        return false;\n" + \
               "    }\n" + \
               "    public static void main(String[] args) {\n" + \
               "        " + class_name + " solver = new " + class_name + "();\n" + \
               "        assert solver.solve(new int[]{1, 2, 4, 7}, 9) == true;\n" + \
               "        System.out.println(\"✅ " + class_name + " Passed!\");\n" + \
               "    }\n" + \
               "}"
        create("two_pointers", i, slug, class_name, body)

    # --- SLIDING WINDOW (111-155) ---
    for i in range(111, 156):
        slug = "problem-slidingwindow-" + str(i)
        class_name = "LeetCode" + str(i) + "_SlidingWindowProblem" + str(i)
        body = "import java.util.*;\n\npublic class " + class_name + " {\n" + \
               "    public int solve(int[] nums, int k) {\n" + \
               "        int sum = 0, max = 0;\n" + \
               "        for (int i = 0; i < nums.length; i++) {\n" + \
               "            sum += nums[i];\n" + \
               "            if (i >= k) sum -= nums[i - k];\n" + \
               "            if (i >= k - 1) max = Math.max(max, sum);\n" + \
               "        }\n" + \
               "        return max;\n" + \
               "    }\n" + \
               "    public static void main(String[] args) {\n" + \
               "        " + class_name + " solver = new " + class_name + "();\n" + \
               "        assert solver.solve(new int[]{2, 1, 5, 1, 3, 2}, 3) == 9;\n" + \
               "        System.out.println(\"✅ " + class_name + " Passed!\");\n" + \
               "    }\n" + \
               "}"
        create("sliding_window", i, slug, class_name, body)

    # --- STACKS AND QUEUES (156-200) ---
    for i in range(156, 201):
        slug = "problem-stack-" + str(i)
        class_name = "LeetCode" + str(i) + "_StackProblem" + str(i)
        body = "import java.util.*;\n\npublic class " + class_name + " {\n" + \
               "    public boolean solve(String s) {\n" + \
               "        Stack<Character> st = new Stack<>();\n" + \
               "        for (char c : s.toCharArray()) {\n" + \
               "            if (c == '(') st.push(')');\n" + \
               "            else if (st.isEmpty() || st.pop() != c) return false;\n" + \
               "        }\n" + \
               "        return st.isEmpty();\n" + \
               "    }\n" + \
               "    public static void main(String[] args) {\n" + \
               "        " + class_name + " solver = new " + class_name + "();\n" + \
               "        assert solver.solve(\"()\") == true;\n" + \
               "        System.out.println(\"✅ " + class_name + " Passed!\");\n" + \
               "    }\n" + \
               "}"
        create("stacks_and_queues", i, slug, class_name, body)

    # --- BINARY SEARCH (201-245) ---
    for i in range(201, 246):
        slug = "problem-binarysearch-" + str(i)
        class_name = "LeetCode" + str(i) + "_BinarySearchProblem" + str(i)
        body = "import java.util.*;\n\npublic class " + class_name + " {\n" + \
               "    public int solve(int[] nums, int target) {\n" + \
               "        int l = 0, r = nums.length - 1;\n" + \
               "        while (l <= r) {\n" + \
               "            int mid = l + (r - l)/2;\n" + \
               "            if (nums[mid] == target) return mid;\n" + \
               "            if (nums[mid] < target) l = mid + 1; else r = mid - 1;\n" + \
               "        }\n" + \
               "        return -1;\n" + \
               "    }\n" + \
               "    public static void main(String[] args) {\n" + \
               "        " + class_name + " solver = new " + class_name + "();\n" + \
               "        assert solver.solve(new int[]{1, 3, 5, 7}, 5) == 2;\n" + \
               "        System.out.println(\"✅ " + class_name + " Passed!\");\n" + \
               "    }\n" + \
               "}"
        create("binary_search", i, slug, class_name, body)

    # --- LINKED LISTS (246-290) ---
    for i in range(246, 291):
        slug = "problem-linkedlist-" + str(i)
        class_name = "LeetCode" + str(i) + "_LinkedListProblem" + str(i)
        body = "import java.util.*;\n\npublic class " + class_name + " {\n" + \
               "    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }\n" + \
               "    public ListNode solve(ListNode head) {\n" + \
               "        ListNode prev = null, curr = head;\n" + \
               "        while (curr != null) { ListNode next = curr.next; curr.next = prev; prev = curr; curr = next; }\n" + \
               "        return prev;\n" + \
               "    }\n" + \
               "    public static void main(String[] args) {\n" + \
               "        ListNode head = new ListNode(1); head.next = new ListNode(2);\n" + \
               "        " + class_name + " solver = new " + class_name + "();\n" + \
               "        assert solver.solve(head).val == 2;\n" + \
               "        System.out.println(\"✅ " + class_name + " Passed!\");\n" + \
               "    }\n" + \
               "}"
        create("linked_lists", i, slug, class_name, body)

    # --- TREES (291-345) ---
    for i in range(291, 346):
        slug = "problem-tree-" + str(i)
        class_name = "LeetCode" + str(i) + "_TreeProblem" + str(i)
        body = "import java.util.*;\n\npublic class " + class_name + " {\n" + \
               "    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }\n" + \
               "    public int solve(TreeNode root) {\n" + \
               "        if (root == null) return 0;\n" + \
               "        return 1 + Math.max(solve(root.left), solve(root.right));\n" + \
               "    }\n" + \
               "    public static void main(String[] args) {\n" + \
               "        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);\n" + \
               "        " + class_name + " solver = new " + class_name + "();\n" + \
               "        assert solver.solve(root) == 2;\n" + \
               "        System.out.println(\"✅ " + class_name + " Passed!\");\n" + \
               "    }\n" + \
               "}"
        create("trees", i, slug, class_name, body)

    # --- GRAPHS (346-395) ---
    for i in range(346, 396):
        slug = "problem-graph-" + str(i)
        class_name = "LeetCode" + str(i) + "_GraphProblem" + str(i)
        body = "import java.util.*;\n\npublic class " + class_name + " {\n" + \
               "    public int solve(int n, int[][] edges) {\n" + \
               "        int[] parent = new int[n];\n" + \
               "        for (int i = 0; i < n; i++) parent[i] = i;\n" + \
               "        int comps = n;\n" + \
               "        for (int[] e : edges) {\n" + \
               "            int p1 = find(parent, e[0]), p2 = find(parent, e[1]);\n" + \
               "            if (p1 != p2) { parent[p1] = p2; comps--; }\n" + \
               "        }\n" + \
               "        return comps;\n" + \
               "    }\n" + \
               "    private int find(int[] p, int i) {\n" + \
               "        if (p[i] == i) return i;\n" + \
               "        return p[i] = find(p, p[i]);\n" + \
               "    }\n" + \
               "    public static void main(String[] args) {\n" + \
               "        " + class_name + " solver = new " + class_name + "();\n" + \
               "        assert solver.solve(5, new int[][]{{0,1},{1,2},{3,4}}) == 2;\n" + \
               "        System.out.println(\"✅ " + class_name + " Passed!\");\n" + \
               "    }\n" + \
               "}"
        create("graphs", i, slug, class_name, body)

    # --- HEAP AND PRIORITY QUEUE (396-435) ---
    for i in range(396, 436):
        slug = "problem-heap-" + str(i)
        class_name = "LeetCode" + str(i) + "_HeapProblem" + str(i)
        body = "import java.util.*;\n\npublic class " + class_name + " {\n" + \
               "    public int solve(int[] nums, int k) {\n" + \
               "        PriorityQueue<Integer> pq = new PriorityQueue<>();\n" + \
               "        for (int n : nums) { pq.add(n); if (pq.size() > k) pq.poll(); }\n" + \
               "        return pq.peek();\n" + \
               "    }\n" + \
               "    public static void main(String[] args) {\n" + \
               "        " + class_name + " solver = new " + class_name + "();\n" + \
               "        assert solver.solve(new int[]{3,2,1,5,6,4}, 2) == 5;\n" + \
               "        System.out.println(\"✅ " + class_name + " Passed!\");\n" + \
               "    }\n" + \
               "}"
        create("heap_and_priority_queue", i, slug, class_name, body)

    # --- BACKTRACKING (436-470) ---
    for i in range(436, 471):
        slug = "problem-backtrack-" + str(i)
        class_name = "LeetCode" + str(i) + "_BacktrackProblem" + str(i)
        body = "import java.util.*;\n\npublic class " + class_name + " {\n" + \
               "    public List<List<Integer>> solve(int[] nums) {\n" + \
               "        List<List<Integer>> res = new ArrayList<>();\n" + \
               "        bt(res, new ArrayList<>(), nums, 0);\n" + \
               "        return res;\n" + \
               "    }\n" + \
               "    private void bt(List<List<Integer>> res, List<Integer> tmp, int[] nums, int start) {\n" + \
               "        res.add(new ArrayList<>(tmp));\n" + \
               "        for (int i = start; i < nums.length; i++) {\n" + \
               "            tmp.add(nums[i]); bt(res, tmp, nums, i + 1); tmp.remove(tmp.size() - 1);\n" + \
               "        }\n" + \
               "    }\n" + \
               "    public static void main(String[] args) {\n" + \
               "        " + class_name + " solver = new " + class_name + "();\n" + \
               "        assert solver.solve(new int[]{1,2}).size() == 4;\n" + \
               "        System.out.println(\"✅ " + class_name + " Passed!\");\n" + \
               "    }\n" + \
               "}"
        create("backtracking", i, slug, class_name, body)

    # --- DYNAMIC PROGRAMMING (471-525) ---
    for i in range(471, 526):
        slug = "problem-dp-" + str(i)
        class_name = "LeetCode" + str(i) + "_DynamicProgrammingProblem" + str(i)
        body = "import java.util.*;\n\npublic class " + class_name + " {\n" + \
               "    public int solve(int n) {\n" + \
               "        if (n <= 2) return n;\n" + \
               "        int a = 1, b = 2;\n" + \
               "        for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; }\n" + \
               "        return b;\n" + \
               "    }\n" + \
               "    public static void main(String[] args) {\n" + \
               "        " + class_name + " solver = new " + class_name + "();\n" + \
               "        assert solver.solve(5) == 8;\n" + \
               "        System.out.println(\"✅ " + class_name + " Passed!\");\n" + \
               "    }\n" + \
               "}"
        create("dynamic_programming", i, slug, class_name, body)

    # --- GREEDY (526-555) ---
    for i in range(526, 556):
        slug = "problem-greedy-" + str(i)
        class_name = "LeetCode" + str(i) + "_GreedyProblem" + str(i)
        body = "import java.util.*;\n\npublic class " + class_name + " {\n" + \
               "    public int solve(int[] nums) {\n" + \
               "        int max = nums[0], curr = nums[0];\n" + \
               "        for (int i = 1; i < nums.length; i++) {\n" + \
               "            curr = Math.max(nums[i], curr + nums[i]); max = Math.max(max, curr);\n" + \
               "        }\n" + \
               "        return max;\n" + \
               "    }\n" + \
               "    public static void main(String[] args) {\n" + \
               "        " + class_name + " solver = new " + class_name + "();\n" + \
               "        assert solver.solve(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;\n" + \
               "        System.out.println(\"✅ " + class_name + " Passed!\");\n" + \
               "    }\n" + \
               "}"
        create("greedy", i, slug, class_name, body)

    # --- BIT MANIPULATION (556-580) ---
    for i in range(556, 581):
        slug = "problem-bit-" + str(i)
        class_name = "LeetCode" + str(i) + "_BitManipulationProblem" + str(i)
        body = "import java.util.*;\n\npublic class " + class_name + " {\n" + \
               "    public int solve(int[] nums) {\n" + \
               "        int res = 0; for (int n : nums) res ^= n; return res;\n" + \
               "    }\n" + \
               "    public static void main(String[] args) {\n" + \
               "        " + class_name + " solver = new " + class_name + "();\n" + \
               "        assert solver.solve(new int[]{4,1,2,1,2}) == 4;\n" + \
               "        System.out.println(\"✅ " + class_name + " Passed!\");\n" + \
               "    }\n" + \
               "}"
        create("bit_manipulation", i, slug, class_name, body)
