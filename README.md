# ⚡ Code Lab (`code-lab`)

> Monorepo housing 500+ genuine Java Data Structures & Algorithms solutions pulled directly from official LeetCode APIs, automations, and Python solvers.

![Java 26](https://img.shields.io/badge/Java_26-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Problems Solved](https://img.shields.io/badge/LeetCode_Solutions-500%2B_Genuine_Java-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)
![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

---

## 📂 Repository Architecture

```
code-lab/
├── ds-algo/                     # Data Structures & Algorithms
│   ├── java/                    # Core Java DS, Streams API, & LRU Cache
│   └── leetcode-practice/       # 500+ Genuine LeetCode Java solutions with Line-1 Problem URLs
│       ├── java/
│       │   ├── arrays_and_hashing/        # 160+ Problems
│       │   ├── two_pointers/              # 15+ Problems
│       │   ├── sliding_window/            # 10+ Problems
│       │   ├── stacks_and_queues/         # 25+ Problems
│       │   ├── binary_search/             # 20+ Problems
│       │   ├── linked_lists/              # 10+ Problems
│       │   ├── trees/                     # 60+ Problems
│       │   ├── graphs/                    # 30+ Problems
│       │   ├── heap_and_priority_queue/   # 15+ Problems
│       │   ├── backtracking/              # 20+ Problems
│       │   ├── dynamic_programming/       # 60+ Problems
│       │   ├── greedy/                    # 10+ Problems
│       │   ├── math/                      # 60+ Problems
│       │   └── bit_manipulation/          # 20+ Problems
│       ├── scrape_official_leetcode.py    # Official LeetCode API scraper
│       └── build_genuine_leetcode_suite.py # Genuine solution builder
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
- **500+ Genuine LeetCode Java Suite**: Every Java file includes the **Direct Official LeetCode Problem URL on Line 1** for instant reference and copy-pasting (`java_runner.py`).

### 2. 🤖 Automations (`automations/`)
- **`resume-uploader`**: Automated browser scripts leveraging Selenium/Playwright for Chromium and Firefox environments.

### 3. 🐍 Utility Scripts (`scripts/`)
- **`verity-solver`**: Python solver script for logical constraint resolution and rule verification.

---

## 👤 Author

**Abhishek Kinagi**
- Director P3 @ Morgan Stanley (IST)
- GitHub: [@kinagiabhishek](https://github.com/kinagiabhishek)
