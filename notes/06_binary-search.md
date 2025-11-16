
# **Binary Search Patterns**

## **Classic Binary Search**

Search for a target in a sorted array.

**When to use:**
Sorted array + direct equality check.

**Key idea:**
Move left/right depending on comparison.

**Example problems:**

* Search in sorted array
* Search insert position
* Find element in infinite/unknown-sized array → variation of classic

---

## **Lower Bound (first element ≥ target)**

Find the first position where `arr[i] >= target`.

**When to use:**
Ceil, first occurrence, insertion index.

**Template:**

```
if (arr[mid] >= target) {
    ans = mid;
    high = mid - 1;
} else {
    low = mid + 1;
}
```

**Problems:**

* First occurrence of target
* Ceil of a number
* Search Insert Position
* Minimum in rotated array

---

## **Upper Bound (first element > target)**

Find first index where `arr[i] > target`.

Useful for count of occurrences.

**Problems:**

* Count how many times target appears
* Last occurrence = upperBound(target) - 1
* Number of elements ≤ k

---

## **Last Occurrence / Floor (arr[i] ≤ target)**

Mirror of lower bound.

**Template:**

```
if (arr[mid] <= target) {
    ans = mid;
    low = mid + 1;
} else {
    high = mid - 1;
}
```

**Problems:**

* Floor
* Last occurrence
* Rightmost valid index

---

## **Binary Search on Answer ("Search the value")**

Most IMPORTANT for DP + Greedy problems.

**Use when:**

* Search **minimum/max value** that satisfies a condition
* Condition is monotonic: F F F F T T T

**Template:**

```
if (condition(mid)) {
    ans = mid;
    high = mid - 1;
} else {
    low = mid + 1;
}
```

**Problems:**

* Koko eating bananas
* Allocate books
* Minimum days to make bouquets
* Capacity to ship packages
* Aggressive cows
* Painters partition
* Median of two sorted arrays (hidden binary-search-on-answer)

---

## **Binary Search in Rotated Sorted Array**

Array is sorted but rotated.

**Key idea:**
One side is always sorted.

Types:

* With duplicates
* Without duplicates
* Find minimum in rotated array
* Search in rotated array

---

## **Searching in 2D Matrix**

Two patterns:

### ✔ Pattern A: Treat 2D matrix as 1D

Used when each row AND each column is sorted globally (LeetCode 74).

Mapping:

```
midRow = mid / cols
midCol = mid % cols
```

### Pattern B: Row-column reduction

Used when each row sorted & each column sorted but not globally (LeetCode 240).

---

## **Binary Search on Function / Monotonic Space**

Apply BS on time, speed, distance, window size.

**Problems:**

* Minimum speed to arrive on time
* Smallest divisor given threshold
* Minimize max distance to gas stations

This is same as BS on Answer but more function-driven.

---

## **Binary Search with Prefix / Checking Feasibility**

Useful when verifying using sliding window or prefix sums.

**Problems:**

* Longest subarray with constraint
* Max minimum distance
* Max length of rope pieces

---

## **Binary Search in Trees**

Used when BST is involved.

**Problems:**

* Find kth smallest in BST (inorder + BS on counts)
* Check how many ≤ mid in BST → BS on Answer
* Find node in BST (classic)

---

## **Binary Search on Floating Values**

When searching in continuous space.

**Problems:**

* Sqrt of number
* Nth root
* Maximize/minimize real-valued answer (probabilities, distances)

**Template:**

```
while (high - low > 1e-6)
```

---

# **Summary — What To Study**

If you learn ONLY these **11 patterns**, you're interview-ready:

```
1. Classic Binary Search
2. Lower Bound
3. Upper Bound
4. Floor / Last Occurrence
5. Binary Search on Answer
6. Rotated Sorted Array Search
7. 2D Matrix Binary Search
8. Function-based Binary Search
9. Feasibility Checking + Binary Search
10. BST-based Binary Search
11. Floating point Binary Search
```

---
