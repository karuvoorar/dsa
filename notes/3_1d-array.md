# Arrays

---

### 🧱 1. Traversal, Two Pointers, Sliding Window

| **Pattern**                        | **What it is**                                                             | **Why learn it**                                                             | **Use cases**                                                                          | **How to identify**                                                                             |
| ---------------------------------- | -------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| **Traversal & Basic Manipulation** | Iterating through array to read, modify, or calculate simple results.      | Forms the base for all array problems — fundamental skill.                   | Find min/max/sum/average, count condition-based elements, update array in-place.       | If only one pass is needed and no “pair” or “subarray” logic → **Traversal**.                   |
| **Two Pointers**                   | Two indexes moving in same or opposite directions to optimize comparisons. | Removes nested loops (O(n²) → O(n)); great for sorted/in-place data.         | Reverse array, pair-sum problems, remove duplicates, partition array.                  | Problem mentions *“pair”*, *“sorted array”*, *“in-place”* → **Two Pointers**.                   |
| **Sliding Window**                 | Maintain a moving range (window) of elements and adjust dynamically.       | Efficient for continuous subarray problems without recomputing from scratch. | Max/min sum subarray, longest substring/subarray with condition, consecutive elements. | Keywords: *“Subarray”, “Substring”, “Longest”, “Smallest”, “Consecutive”* → **Sliding Window**. |

---

### 🔢 2. Prefix Sum, Sorting, Hashing

| **Pattern**                             | **What it is**                                                              | **Why learn it**                                               | **Use cases**                                                            | **How to identify**                                                                                 |
| --------------------------------------- | --------------------------------------------------------------------------- | -------------------------------------------------------------- | ------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------- |
| **Prefix Sum / Difference Array**       | Store cumulative sums for O(1) range sum queries (`prefix[r]-prefix[l-1]`). | Avoid repeated summations, ideal for range-sum problems.       | Range queries, subarray sum = K, equilibrium index, Kadane variants.     | Problem mentions *“Sum between indices”* or repeated range queries → **Prefix Sum**.                |
| **Sorting + Searching (Binary Search)** | Sort arrays or use binary search to locate/decide efficiently.              | Divides problem space → faster searching and boundary finding. | Search element, find duplicates/missing, optimize pair/triplet problems. | Input is **sorted** or can be sorted; terms like *“first”, “last”, “boundary”* → **Binary Search**. |
| **Hashing / Frequency Maps**            | Store element counts or existence via hash map/set.                         | Enables O(1) lookup; replaces brute-force searches.            | Find duplicates, count frequencies, detect intersections or pair sums.   | Phrases like *“exists”, “count pairs”, “unique/majority element”* → **Hashing**.                    |

---

### ⚡ 3. Kadane, Cyclic Sort, Matrix

| **Pattern**                       | **What it is**                                 | **Why learn it**                                               | **Use cases**                                                   | **How to identify**                                                             |
| --------------------------------- | ---------------------------------------------- | -------------------------------------------------------------- | --------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| **Kadane’s Algorithm**            | Maintain running sum; reset when negative.     | Fastest way to find max subarray sums; foundation for some DP. | Max subarray sum, max profit (stock buy/sell).                  | Mentions *“maximum subarray sum/profit”* → **Kadane’s**.                        |
| **Cyclic Sort / Index Placement** | Place each element at its correct index (1…n). | Finds missing/duplicate numbers in O(n) and O(1) space.        | Missing/duplicate numbers, smallest missing positive.           | Mentions *“Numbers from 1 to n”*, *“Find missing/duplicate”* → **Cyclic Sort**. |
| **Matrix / 2D Array Patterns**    | Arrays with rows & columns (2D traversal).     | Extends 1D logic to 2D → used in DP, graphs, grids.            | Rotate/transpose matrix, spiral traversal, search in 2D matrix. | Input mentions *rows, columns, diagonals* → **Matrix Traversal**.               |

---

### 🧩 4. Merge Intervals, XOR, Divide & Conquer

| **Pattern**                   | **What it is**                                         | **Why learn it**                                          | **Use cases**                                                         | **How to identify**                                                                           |
| ----------------------------- | ------------------------------------------------------ | --------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| **Merge Intervals**           | Sort intervals and merge overlapping ones.             | Crucial for scheduling/time range problems.               | Merge overlapping intervals, insert new interval, meeting rooms.      | Input format: `[start, end]` → **Merge Intervals**.                                           |
| **XOR / Mathematical Tricks** | Use XOR/math identities to avoid loops or extra space. | Simplifies problems like finding unique/missing elements. | Unique element among duplicates, missing number, XOR subarray checks. | Mentions *“Every element appears twice except one”*, *“Find missing number”* → **XOR Trick**. |
| **Divide & Conquer**          | Split array → solve recursively → combine.             | Foundation for recursion and advanced sorting/searching.  | Merge Sort, Quick Sort, Binary Search, inversion count.               | Problem splits naturally into halves → **Divide & Conquer**.                                  |

---

### 🧭 5. Pattern Identification Cheatsheet

| **Problem Type / Keyword**               | **Likely Pattern**          | **Reason / Key Idea**                  |
| ---------------------------------------- | --------------------------- | -------------------------------------- |
| “Find pair/triplet/target sum”           | Two Pointers / Hashing      | Pairs need fast comparisons or lookups |
| “Subarray / substring”                   | Sliding Window / Prefix Sum | Continuous range logic                 |
| “Range query / sum between L–R”          | Prefix Sum                  | Efficient range precomputation         |
| “Sorted array / first / last / boundary” | Binary Search               | Half-based search or decision          |
| “Numbers from 1 to n”                    | Cyclic Sort                 | Range-based index mapping              |
| “Count frequency / find unique”          | Hash Map                    | Track element frequency                |
| “Max subarray sum / profit”              | Kadane’s Algorithm          | Dynamic running-sum approach           |
| “Matrix / grid / 2D traversal”           | Matrix Traversal            | 2D logic (rows/cols)                   |
| “Intervals / overlapping ranges”         | Merge Intervals             | Sort + merge boundaries                |
| “Each element appears twice except one”  | XOR Trick                   | XOR cancels duplicates                 |
| “Split and combine recursively”          | Divide & Conquer            | Recursive divide logic                 |
| “Do in-place / no extra space”           | Two Pointers / Cyclic Sort  | Avoid extra memory                     |

---
