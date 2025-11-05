# DSA Patterns


| Pattern                                             | Core Data Structure(s) | Core Idea                                      | Common Problem Types                  | Tags                                            | ✅ Done |
| --------------------------------------------------- | ---------------------- | ---------------------------------------------- | ------------------------------------- | ----------------------------------------------- | ------ |
| **Traversal & Basic Manipulation**                  | Array / List           | Iterate to compute, modify, or filter          | Sum, count, min/max, reverse          | `array`, `loop`, `iteration`                    |   ✅    |
| **Two Pointers**                                    | Array / String         | Move two indices to compare or shrink ranges   | Pair sum, palindrome, merging         | `two-pointers`, `string`, `array`               | ☐      |
| **Sliding Window**                                  | Array / String         | Maintain a dynamic window while traversing     | Max/min subarray, substring, anagrams | `sliding-window`, `string`, `subarray`          | ☐      |
| **Prefix Sum / XOR / Difference Array**             | Array / HashMap        | Store cumulative values for fast range queries | Subarray sum, XOR subarray count      | `prefix-sum`, `xor`, `hashmap`                  | ☐      |
| **Hashing / Frequency Maps**                        | HashMap / Set          | Store counts or seen states for O(1) lookup    | Counting, anagrams, complements       | `hashmap`, `set`, `counting`                    | ☐      |
| **Sorting & Binary Search**                         | Array                  | Sort and search efficiently                    | Search, insertion, rotated array      | `sorting`, `binary-search`, `divide-conquer`    | ☐      |
| **Divide and Conquer**                              | Array / Recursion      | Split problem and combine results              | Merge sort, max subarray              | `recursion`, `divide-conquer`, `merge-sort`     | ☐      |
| **Greedy Algorithms**                               | Array / Interval       | Pick local optimal at each step                | Scheduling, jumps, intervals          | `greedy`, `intervals`, `sorting`                | ☐      |
| **Stack / Monotonic Stack**                         | Stack / Array          | Use stack to track previous elements           | Next greater, parentheses, spans      | `stack`, `monotonic`, `parentheses`             | ☐      |
| **Queue / Deque**                                   | Queue / Deque          | Track elements in order or window              | BFS, sliding window max               | `queue`, `deque`, `bfs`                         | ☐      |
| **Recursion & Backtracking**                        | Recursion / Stack      | Explore all states and backtrack invalid ones  | Permutations, combinations, sudoku    | `recursion`, `backtracking`, `dfs`              | ☐      |
| **Dynamic Programming (DP)**                        | Array / Matrix / Memo  | Optimize overlapping subproblems               | Knapsack, subsequences, paths         | `dp`, `memoization`, `tabulation`               | ☐      |
| **Matrix / 2D Arrays**                              | Matrix                 | Work row-wise, col-wise, or diagonally         | Search, rotation, flood fill          | `matrix`, `2d-array`, `grid`                    | ☐      |
| **Bit Manipulation**                                | Bitset / Integer       | Use bitwise ops for efficiency                 | XOR pairs, subsets, bit counting      | `bitmask`, `xor`, `binary`                      | ☐      |
| **Graph Traversal (BFS/DFS)**                       | Graph / Adjacency List | Explore nodes and edges                        | Islands, paths, connectivity          | `graph`, `bfs`, `dfs`                           | ☐      |
| **Topological Sort / DAGs**                         | Graph / Queue          | Linearize dependency order                     | Course scheduling, ordering           | `graph`, `toposort`, `dag`                      | ☐      |
| **Union-Find (Disjoint Set)**                       | Array / Graph          | Merge and find connected components            | Provinces, redundant edges            | `union-find`, `disjoint-set`, `graph`           | ☐      |
| **Heap / Priority Queue**                           | Heap                   | Maintain min/max efficiently                   | Top-K, intervals, scheduling          | `heap`, `priority-queue`, `sorting`             | ☐      |
| **Trie (Prefix Tree)**                              | Tree / HashMap         | Store prefixes for fast lookup                 | Autocomplete, prefix search           | `trie`, `prefix`, `string`                      | ☐      |
| **Recursion Trees & State Reduction**               | Recursion / DP         | Visualize recursion → optimize                 | Subproblems, memoization              | `recursion-tree`, `dp`, `optimization`          | ☐      |
| **Mathematical / Number Theory**                    | Integers / Math        | Use math formulas and properties               | GCD/LCM, primes, modular math         | `math`, `number-theory`, `modular-arithmetic`   | ☐      |
| **String Manipulation / Pattern Search**            | String / Array         | Efficient substring operations                 | Pattern match, repetition, KMP        | `string`, `kmp`, `z-algorithm`                  | ☐      |
| **Intervals**                                       | Array / Sorting        | Handle overlapping or merging intervals        | Merge, meeting rooms                  | `intervals`, `sorting`, `merge`                 | ☐      |
| **Tree Traversals**                                 | Tree                   | Explore binary tree structures                 | Inorder, preorder, postorder          | `tree`, `bfs`, `dfs`                            | ☐      |
| **Binary Search on Answer**                         | Math / Search Space    | Search over possible answers                   | Threshold, capacity, min/max value    | `binary-search`, `search-space`, `optimization` | ☐      |
| **Segment Tree / Fenwick Tree**                     | Tree / Array           | Range queries and updates                      | Range sum/min/max                     | `segment-tree`, `fenwick-tree`, `range-query`   | ☐      |
| **Shortest Path (Dijkstra / Bellman-Ford / Floyd)** | Graph / Heap           | Find shortest path in weighted graphs          | Network delay, cheapest route         | `graph`, `shortest-path`, `dijkstra`            | ☐      |
| **Backtracking with Constraints (Advanced)**        | Recursion / Pruning    | Backtrack + constraint pruning                 | N-Queens, Sudoku                      | `backtracking`, `pruning`, `constraint`         | ☐      |
| **Geometry / Simulation / Sweep Line**              | Geometry / Events      | Simulate spatial or line events                | Skyline, overlap area                 | `geometry`, `simulation`, `sweep-line`          | ☐      |
| **Advanced Graphs (MST / BFS-0-1 / Multi-source)**  | Graph / Priority Queue | Advanced connectivity and optimization         | Kruskal, Prim, 0-1 BFS                | `mst`, `graph`, `priority-queue`                | ☐      |

---

### 🧩 Learning Order

1. **Foundation:** Traversal → Two Pointers → Hashing → Sliding Window
2. **Core:** Recursion → DP → Stack/Queue → Binary Search
3. **Advanced:** Trees → Graphs → Tries → Heaps
4. **Expert:** Segment Tree → Union-Find → Geometry → Optimizations

