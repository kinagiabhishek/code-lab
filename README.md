# ⚡ Code Lab (`code-lab`)

> Monorepo housing 200+ 100% verified, authentic Java Data Structures & Algorithms solutions, automations, and Python solvers.

![Java 26](https://img.shields.io/badge/Java_26-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Problems Solved](https://img.shields.io/badge/LeetCode_Solutions-200%2B_Authentic_Java-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)
![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

---

## 📂 Repository Architecture

```
code-lab/
├── ds-algo/                     # Data Structures & Algorithms
│   ├── java/                    # Core Java DS, Streams API, & LRU Cache
│   └── leetcode-practice/       # 200+ Authentic LeetCode Java solutions with Line-1 Problem URLs
│       ├── java/                # Clean Java solution files organized by topic
│       │   ├── arrays_and_hashing/        # TwoSum.java, CountAndSay.java, ArrayPartition.java, GroupAnagrams.java
│       │   ├── two_pointers/              # TrappingRainWater.java, ThreeSum.java, FourSum.java, ContainerWithMostWater.java
│       │   ├── sliding_window/            # MinimumWindowSubstring.java, LongestSubstringWithoutRepeatingCharacters.java
│       │   ├── stacks_and_queues/         # ValidParentheses.java, EvaluateReversePolishNotation.java, DailyTemperatures.java
│       │   ├── binary_search/             # SearchA2dMatrix.java, SearchInRotatedSortedArray.java, BinarySearch.java
│       │   ├── linked_lists/              # AddTwoNumbers.java, LRUCache.java, ReverseLinkedList.java
│       │   ├── trees/                     # ValidateBinarySearchTree.java, SameTree.java, BinaryTreeMaxPathSum.java
│       │   ├── graphs/                    # NumberOfIslands.java, CourseSchedule.java, CloneGraph.java
│       │   ├── heap_and_priority_queue/   # MergeKSortedLists.java, FindMedianDataStream.java
│       │   ├── backtracking/              # Permutations.java, Subsets.java, CombinationSum.java
│       │   ├── dynamic_programming/       # CoinChange.java, HouseRobber.java, LongestPalindromicSubstring.java
│       │   ├── greedy/                    # JumpGame.java, MaximumSubarray.java, GasStation.java
│       │   ├── math/                      # AddStrings.java, MultiplyStrings.java, RotateImage.java, ReverseInteger.java
│       │   └── bit_manipulation/          # SingleNumber.java, NumberOf1Bits.java, SumOfTwoIntegers.java
│       └── scripts/             # Python runner helper scripts
│           └── java_runner.py                 # OpenJDK Java compilation & assertion runner
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
- **200+ Authentic LeetCode Java Suite**: Every Java file is **100% authentic with exact LeetCode method signatures and assertion tests**, compiled and verified via OpenJDK 26 (`scripts/java_runner.py`).

### 2. 🤖 Automations (`automations/`)
- **`resume-uploader`**: Automated browser scripts leveraging Selenium/Playwright for Chromium and Firefox environments.

### 3. 🐍 Utility Scripts (`scripts/`)
- **`verity-solver`**: Python solver script for logical constraint resolution and rule verification.

---

## 👤 Author

**Abhishek Kinagi**
- Director P3 @ Morgan Stanley (IST)
- GitHub: [@kinagiabhishek](https://github.com/kinagiabhishek)
