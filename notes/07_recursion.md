# Recursion

A function that calls itself to solve a problem, dividing the problem to sub-problems, until it reaches a
**base condition** that further stops processing calls.

## Solving Parts
1. Base Case - to stop the on-going calls when this condition reaches.
2. Recurrence Solution - the function that calls itself with reduced input.

Cut to the point. Here are the **only recursion patterns that matter**
for your current level (arrays, strings, binary-search–based logic).
These are the patterns interviewers repeatedly test. Keep this list bookmarked mentally.

---

### 1. **Pure Decrease (Linear Recursion)**

**Idea:** reduce the problem by one index each call.

**Template:**

```
recur(i):
    if i == end: return
    recur(i+1)
```

**Use cases:**

* Array traversal
* Sum, max, min
* String traversal
* Reversing a string/array
* Factorial, Fibonacci (naive)

**Questions:**

* Reverse string
* Sum of array
* Print from front/back

**Remember:** trivial pattern, no branching.

---

### 2. **Two-Branch Recursion (Decision Tree)**

**Idea:** choose or skip something.

**Template:**

```
recur(i):
    if i == n: collect
    include i
    exclude i
```

**Use cases:**

* Subsets (power set)
* Subsequences
* Combination Sum (without loops)
* Binary string generation

**Questions:**

* Power set of nums
* All subsequences of string
* All paths with +/-

**Remember:** 2 branches → O(2ⁿ).
Strings are immutable → **do NOT backtrack strings**, simply pass `path + char`.

---

### 3. **For-loop Based Recursion (Permutation/Combination Builder)**

**Idea:** loop at each level and recursively explore.

**Template:**

```
for j from i..n:
    choose j
    recur(j+1 or 0)
    unchoose j
```

**Use cases:**

* Permutations
* Combinations
* Phone keypad combinations
* Letter case change
* Palindrome partitioning

**Questions:**

* Permutations of [a,b,c]
* Combinations of size k
* Phone keypad T9
* Unique permutations

**Remember:**

* For **arrays** → swap for permutations.
* For **strings** → pass new string (no backtracking).
* For **lists/char[]** → mutate + backtrack.

---

### 4. **Grid DFS Recursion**

**Idea:** explore 4 or 8 directions with boundary and visited checks.

**Template:**

```
dfs(r,c):
    if out of bounds or visited: return
    mark
    dfs(4 directions)
    unmark
```

**Use cases:**

* Word search
* Island count
* Path finding
* Maze problems

**Questions:**

* Word search (exist)
* Number of islands
* Flood fill
* Rat in a maze

**Remember:**
Boundary check + visited is **mandatory**.
Avoid strings backtracking mistake — char[][] works with marking/unmarking.

---

### 5. **Binary Search Recursion**

**Idea:** divide into half each call.

**Template:**

```
binary(l,r):
    if l > r: return
    mid
    if condition → go left or right
```

**Use cases:**

* Search
* First/last occurrence
* Peak element
* Rotated array
* Aggressive cows / minimize max distance (binary search on answer)

**Questions:**

* Search sorted array
* Search rotated array
* First/last index
* Peak element (mountain array)
* BS on answer: Painters, cows, ship packages

**Remember:**
Always compute mid safely; avoid infinite loops.

---

### 6. **Divide & Conquer**

**Idea:** split, solve, merge.

**Template:**

```
solve(l,r):
    if single element: return
    mid
    left = solve(l,mid)
    right = solve(mid+1,r)
    merge left + right
```

**Use cases:**

* Merge sort
* Quick sort
* Majority element (DC)
* Max subarray (Kadane DC version)

**Questions:**

* Merge sort
* Quick sort
* Count inversions
* Maximum subarray sum (divide & conquer)

**Remember:**
Always combine results on return path.

---

### 7. **Recursion with State (DP Style Without Memo)**

**Idea:** recursion where path carries state (index + value).

**Template:**

```
recur(i, state):
    if base: return state
    recur(i+1, updated_state)
```

**Use cases:**

* Binary search on answer feasibility checks
* Palindrome checks
* Balanced parentheses count
* String comparisons

**Questions:**

* Valid parentheses recursion
* Count partitions
* Count subsets equal to target

---

### 8. **DFS With Backtracking (Mark → Recurse → Unmark)**

**Idea:** mutate structure, restore after return.

**Template:**

```
path.add(x)
dfs(...)
path.removeLast()
```

**Use cases:**

* Permutations (list)
* Combination sum
* N-Queens
* Sudoku solver

**Questions:**

* N-Queens
* Sudoku
* Combination sum, combination sum II
* All paths in grid

**Remember:**
Mutating structures **always** require backtracking.

---

## What to Remember in One Line per Pattern

* **Linear:** one call, decreasing index.
* **Two-branch:** include/exclude.
* **Loop-based:** permutations/combos; loop controls recursion.
* **Grid DFS:** boundary + visited.
* **Binary search:** half the space each call.
* **Divide & conquer:** split and merge.
* **Stateful recursion:** carries extra params.
* **Backtracking:** mutate → recurse → undo.

---
