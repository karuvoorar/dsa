# Arrays DSA Master Notes

---

## 1. Traversal & Basic Manipulation

**What it is:**
Iterating through the array to read, modify, or calculate simple results.

**Why learn it:**
Forms the base for all other patterns. Every algorithm manipulates array indices at some level.

**Use cases:**

* Find min/max/sum/average
* Count elements meeting a condition
* Simple updates (`arr[i] = something`)

**How to identify:**

* If the problem only needs one pass and no “pair” or “subarray” logic → this is it.

---

## 2. Two Pointers Technique

**What it is:**
Use two indexes moving from different ends or in the same direction to optimize comparisons.

**Why learn it:**
Removes nested loops (O(n²)) → makes it O(n). Great for sorted data and space-efficient solutions.

**Use cases:**

* Reverse array
* Pair-sum problems (`target` sum)
* Remove duplicates
* Partition array (move negatives/zeroes)

**How to identify:**

* Problem says: *“Find pair”*, *“Sorted array”*, *“Do it in-place”* → Think **Two Pointers**.

---

## 3. Sliding Window

**What it is:**
Maintain a moving range (window) of elements and adjust it dynamically.

**Why learn it:**
Used when you process *continuous subarrays* efficiently (no recomputing from scratch).

**Use cases:**

* Max/min sum subarray
* Longest substring/subarray with condition
* Consecutive elements

**How to identify:**

* Keywords: *“Subarray”, “Substring”, “Longest”, “Smallest”, “Consecutive”* → **Sliding Window.**

---

## 4. Prefix Sum / Difference Array

**What it is:**
Store cumulative sums so any range sum can be computed as `prefix[r] - prefix[l-1]`.

**Why learn it:**
Avoid repeated summation, great for range queries and subarray-sum-based problems.

**Use cases:**

* Range queries
* Subarray sum equals `K`
* Equilibrium index
* Kadane variations

**How to identify:**

* “Sum between indices” or repeated range queries → **Prefix Sum.**

---

## 5. Sorting + Searching (Binary Search Patterns)

**What it is:**
Sort arrays to reveal structure, or use binary search to locate or decide efficiently.

**Why learn it:**
Key to optimization — divides problem into halves and simplifies many comparisons.

**Use cases:**

* Search element or boundary
* Find duplicates/missing elements
* Optimize pair/triplet problems

**How to identify:**

* If input is **sorted** or can be sorted
* Question says **“first”, “last”, “minimum”, “boundary”** → **Binary Search.**

---

## 6. Hashing / Frequency Maps

**What it is:**
Store counts, presence, or indices in a hash map or set for O(1) lookups.

**Why learn it:**
Replaces brute-force searching and allows quick lookups, counting, or existence checks.

**Use cases:**

* Find duplicates
* Count frequencies
* Detect sums or intersections

**How to identify:**

* Keywords: *“Find if exists”, “Count number of pairs”, “Return unique/majority element”* → **Hashing.**

---

## 7. Kadane’s Algorithm (Dynamic Sliding Window)

**What it is:**
Maintain running sum; reset when sum becomes negative.

**Why learn it:**
The most efficient way to find maximum subarray sums. Forms the basis for some DP ideas.

**Use cases:**

* Max subarray sum
* Max profit (stock buy/sell)

**How to identify:**

* If it asks: *“maximum subarray sum/profit”* → **Kadane’s.**

---

## 8. Cyclic Sort / Index Placement

**What it is:**
Place each element in its correct index (used for arrays with elements 1…n).

**Why learn it:**
Avoids extra memory and helps find missing/duplicate elements in O(n).

**Use cases:**

* Missing numbers
* Duplicate numbers
* Smallest missing positive

**How to identify:**

* Keywords: *“Numbers are from 1 to n”*, *“Find missing/duplicate/mismatch”* → **Cyclic Sort.**

---

## 9. Matrix / 2D Array Patterns

**What it is:**
Arrays with rows and columns; traversed by two indices.

**Why learn it:**
Extends array logic to 2D — foundation for graphs, DP tables, grids, etc.

**Use cases:**

* Rotate / Transpose matrix
* Spiral order traversal
* Search in sorted 2D matrix

**How to identify:**

* Input is 2D or mentions *rows, columns, diagonals* → **Matrix traversal.**

---

## 10. Merge Intervals

**What it is:**
Sort intervals and merge overlapping ones.

**Why learn it:**
Common pattern in scheduling, time slots, and segment-related problems.

**Use cases:**

* Merge overlapping intervals
* Insert new interval
* Meeting rooms

**How to identify:**

* Input format: `[start, end]` ranges → **Merge Intervals.**

---

## 11. XOR / Mathematical Tricks

**What it is:**
Use XOR or math identities to avoid loops and simplify logic.

**Why learn it:**
Elegant and fast for “find single element” or “missing number” style problems.

**Use cases:**

* Unique element among duplicates
* Missing number
* XOR-based subarray checks

**How to identify:**

* “Every element appears twice except one”
* “Find missing number without extra space” → **XOR pattern.**

---

## 12. Divide and Conquer

**What it is:**
Split the problem into subarrays, solve recursively, and combine results.

**Why learn it:**
Used in sorting/searching; builds foundation for recursion and advanced algorithms.

**Use cases:**

* Merge Sort / Quick Sort
* Binary Search
* Inversion count

**How to identify:**

* Problem naturally splits into halves → **Divide & Conquer.**

---

## 🧩 Pattern Identification Cheatsheet

| **Problem Type / Keyword**               | **Likely Pattern**          | **Reason / Key Idea**                    |
| ---------------------------------------- | --------------------------- | ---------------------------------------- |
| “Find pair/triplet/target sum”           | Two Pointers / Hashing      | Pairs need comparisons or fast lookups   |
| “Subarray / substring”                   | Sliding Window / Prefix Sum | Continuous segments of array             |
| “Range query / sum between L–R”          | Prefix Sum                  | Efficient precomputation                 |
| “Sorted array / first / last / boundary” | Binary Search               | Search or decision-based optimization    |
| “Numbers from 1 to n”                    | Cyclic Sort                 | Range-bound elements imply index mapping |
| “Count frequency / find unique”          | Hash Map                    | Store frequency or existence             |
| “Max subarray sum / profit”              | Kadane’s Algorithm          | Dynamic running-sum approach             |
| “Matrix / grid / 2D traversal”           | Matrix Traversal            | 2D indexing logic                        |
| “Intervals / overlapping ranges”         | Merge Intervals             | Sort + merge boundaries                  |
| “Each element appears twice except one”  | XOR Trick                   | XOR cancels duplicates                   |
| “Split and combine recursively”          | Divide & Conquer            | Subarray recursion logic                 |
| “Do in-place / no extra space”           | Two Pointers / Cyclic Sort  | Avoids using auxiliary arrays            |

---

### 🧭 Summary

> **Array mastery = recognizing patterns + knowing when to apply them.**
> Don’t just memorize problems — train your brain to match a problem’s *structure* to a pattern.

---

Would you like me to make a **“visual mind map” version** of this (like a diagram linking patterns → triggers → examples)?
It’s great for quick recall when preparing for interviews.
