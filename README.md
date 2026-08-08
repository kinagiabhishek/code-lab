# ⚡ Code Lab (`code-lab`)

> Monorepo housing Java Data Structures & Algorithms, LeetCode practice suites, Selenium/Playwright automations, and Python solvers.

![Java 26](https://img.shields.io/badge/Java_26-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

---

## 📂 Repository Architecture

```
code-lab/
├── ds-algo/                     # Data Structures & Algorithms
│   ├── java/                    # Core Java DS, Streams API, & LRU Cache
│   └── leetcode-practice/       # LeetCode Java practice suite & test runner
│       ├── java/
│       │   ├── arrays_and_hashing/
│       │   ├── two_pointers/
│       │   ├── sliding_window/
│       │   ├── stacks_and_queues/
│       │   ├── binary_search/
│       │   ├── linked_lists/
│       │   ├── trees/
│       │   ├── graphs/
│       │   ├── heap_and_priority_queue/
│       │   ├── backtracking/
│       │   ├── greedy/
│       │   └── bit_manipulation/
│       └── java_runner.py       # OpenJDK Java compilation & assertion runner
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
- **LeetCode Practice Suite**: Categorized Java solutions spanning Trees, Graphs, Stacks/Queues, Linked Lists, Heaps, Backtracking, DP, Sliding Window, and Bit Manipulation (`java_runner.py`).

### 2. 🤖 Automations (`automations/`)
- **`resume-uploader`**: Automated browser scripts leveraging Selenium/Playwright for Chromium and Firefox environments.

### 3. 🐍 Utility Scripts (`scripts/`)
- **`verity-solver`**: Python solver script for logical constraint resolution and rule verification.

---

## 👤 Author

**Abhishek Kinagi**
- Director P3 @ Morgan Stanley (IST)
- GitHub: [@kinagiabhishek](https://github.com/kinagiabhishek)
