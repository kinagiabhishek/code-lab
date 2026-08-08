# ⚡ Code Lab (`code-lab`)

> Monorepo housing GraphQL-verified Java Data Structures & Algorithms solutions, automations, and Python solvers.

![Java 26](https://img.shields.io/badge/Java_26-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Problems Solved](https://img.shields.io/badge/LeetCode_Solutions-GraphQL_Verified_Java-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)
![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

---

## 📂 Repository Architecture

```
code-lab/
├── ds-algo/                     # Data Structures & Algorithms
│   ├── java/                    # Core Java DS, Streams API, & LRU Cache
│   └── leetcode-practice/       # LeetCode Java practice suite & helper tools
│       ├── java/                # Clean Java solution files organized by topic
│       │   ├── arrays_and_hashing/        # Array, Hash Table & String Problems (TwoSum.java)
│       │   ├── two_pointers/              # Two Pointers Problems (TrappingRainWater.java)
│       │   ├── sliding_window/            # Sliding Window Problems (MinimumWindowSubstring.java)
│       │   ├── stacks_and_queues/         # Stack & Monotonic Queue Problems (ValidParentheses.java)
│       │   ├── binary_search/             # Binary Search Problems (SearchA2dMatrix.java)
│       │   ├── linked_lists/              # Linked List Problems (AddTwoNumbers.java, LRUCache.java)
│       │   ├── trees/                     # Binary Tree & BST Problems (ValidateBinarySearchTree.java)
│       │   ├── graphs/                    # Graph & DFS/BFS Problems (NumberOfIslands.java)
│       │   ├── heap_and_priority_queue/   # Heap & Priority Queue Problems (MergeKSortedLists.java)
│       │   ├── backtracking/              # Backtracking & Combinatorics (Permutations.java)
│       │   ├── dynamic_programming/       # Dynamic Programming & DP Memoization (CoinChange.java)
│       │   ├── greedy/                    # Greedy Choice Problems (JumpGame.java)
│       │   ├── math/                      # Math & Number Theory Problems (RotateImage.java)
│       │   └── bit_manipulation/          # Bit Manipulation Problems (SingleNumber.java)
│       └── scripts/             # Python runner and generator helper scripts
│           ├── java_runner.py                 # OpenJDK Java compilation & assertion runner
│           ├── scrape_official_leetcode.py    # Official LeetCode API scraper
│           ├── meticulous_solution_generator.py # Official GraphQL snippet generator
│           └── populate_meticulous_solutions.py # Solution & local assertion runner
├── automations/                 # Web & Process Automations
│   └── resume-uploader/         # Selenium & Playwright browser automation
└── scripts/                     # Standalone Python Solvers & Utilities
    └── verity-solver/           # Verity constraint solver implementation
```

---

## 🛠️ Modules Overview

### 1. 🧮 Data Structures & Algorithms (`ds-algo/`)
Contains custom implementations of core data structures and algorithm solutions in **Java**.
- **Core Java DS**: Binary Search, LRU Cache design, Streams API utilities.
- **LeetCode Java Practice Suite**: Clean Java solution files organized by topic with verified Line-1 URLs (`scripts/java_runner.py`).

### 2. 🤖 Automations (`automations/`)
- **`resume-uploader`**: Automated browser scripts leveraging Selenium/Playwright for Chromium and Firefox environments.

### 3. 🐍 Utility Scripts (`scripts/`)
- **`verity-solver`**: Python solver script for logical constraint resolution and rule verification.

---

## 👤 Author

**Abhishek Kinagi**
- Director P3 @ Morgan Stanley (IST)
- GitHub: [@kinagiabhishek](https://github.com/kinagiabhishek)
