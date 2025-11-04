# Mastering Sorting Algorithms — Competitive Programming & Interviews

Sorting is the **foundation** for solving many DSA and CP problems. A strong grip on it helps you identify patterns like *Divide & Conquer*, *Greedy*, and *Two-Pointers* faster.

---

## 📘 Why Sorting Matters

| Purpose                  | Description                                                               | Example Problems              |
| ------------------------ | ------------------------------------------------------------------------- | ----------------------------- |
| **Preprocessing Step**   | Used to simplify problems (like removing duplicates, finding pairs, etc.) | Two-sum using two pointers    |
| **Optimization**         | Helps in minimizing or maximizing certain outcomes                        | Job sequencing, Meeting rooms |
| **Divide & Conquer**     | Used in recursive strategy problems                                       | Merge sort, Quick sort        |
| **Comparative Baseline** | To understand complexity, stability, and in-place behavior                | Comparing sorting algorithms  |
| **Interview Foundation** | Sorting is a top-5 topic in FAANG and competitive exams                   | Arrays, Strings, Greedy       |

---

## ⚙️ Classification of Sorting Algorithms

| Category                     | Examples                                                             | Description                                 |
| ---------------------------- | -------------------------------------------------------------------- | ------------------------------------------- |
| **Comparison-based**         | Bubble, Insertion, Selection, Merge, Quick, Heap                     | Compare elements pairwise                   |
| **Non-comparison-based**     | Counting, Radix, Bucket                                              | Use mathematical logic on numbers           |
| **Stable vs Unstable**       | Stable: Merge, Bubble, Insertion<br>Unstable: Quick, Selection, Heap | Stability preserves order of equal elements |
| **In-place vs Not In-place** | In-place: Quick, Heap, Insertion<br>Not In-place: Merge              | In-place means O(1) extra space             |

---

## 🧩 Sorting Algorithms Deep Dive

### 🔹 1. **Bubble Sort**

**Idea:** Repeatedly swap adjacent elements if they are in the wrong order.
**Best Case:** O(n)
**Worst Case:** O(n²)
**Stable:** ✅
**In-place:** ✅
**When to Use:** When array is *almost sorted*.

```java
for (int i = 0; i < n - 1; i++)
    for (int j = 0; j < n - i - 1; j++)
        if (arr[j] > arr[j + 1])
            swap(arr, j, j + 1);
```

---

### 🔹 2. **Selection Sort**

**Idea:** Select the smallest element and place it at the beginning.
**Best/Worst/Average:** O(n²)
**Stable:** ❌
**In-place:** ✅
**When to Use:** When memory writes are costly (e.g., flash memory).

---

### 🔹 3. **Insertion Sort**

**Idea:** Build sorted array one item at a time by inserting elements in correct position.
**Best Case:** O(n)
**Worst Case:** O(n²)
**Stable:** ✅
**In-place:** ✅
**When to Use:** For *small arrays* or *nearly sorted arrays*.

---

### 🔹 4. **Merge Sort**

**Idea:** Divide array, sort each half, then merge.
**Approach:** *Divide & Conquer*
**Time Complexity:** O(n log n)
**Space Complexity:** O(n)
**Stable:** ✅
**In-place:** ❌
**When to Use:** When stability matters (e.g., sorting objects by multiple keys).

**Recursion Tree:**
Each level divides the array → log(n) levels → merging cost = O(n).

```java
private int[] mergeSort(int[] arr, int left, int right) {
    if (left >= right) return new int[]{arr[left]};
    int mid = (left + right) / 2;
    int[] leftArr = mergeSort(arr, left, mid);
    int[] rightArr = mergeSort(arr, mid + 1, right);
    return merge(leftArr, rightArr);
}
```

---

### 🔹 5. **Quick Sort**

**Idea:** Choose a pivot, partition array into left (smaller) and right (greater) sides, and recursively sort.
**Approach:** *Divide & Conquer*
**Best Case:** O(n log n)
**Worst Case:** O(n²) *(bad pivot choice)*
**Average Case:** O(n log n)
**In-place:** ✅
**Stable:** ❌

**When to Use:** General-purpose fast sorting, especially in competitive programming.

---

### 🔹 6. **Heap Sort**

**Idea:** Build a max heap, then repeatedly extract max to sort.
**Time Complexity:** O(n log n)
**Space Complexity:** O(1)
**In-place:** ✅
**Stable:** ❌
**When to Use:** When you need guaranteed O(n log n) without recursion.

---

### 🔹 7. **Counting Sort**

**Idea:** Count occurrences of each unique value (non-comparison).
**Time Complexity:** O(n + k)
**Space:** O(k)
**Stable:** ✅
**When to Use:** Small integer range.

---

### 🔹 8. **Radix Sort**

**Idea:** Sort numbers digit by digit using Counting Sort as subroutine.
**Time Complexity:** O(d*(n + k))
**When to Use:** Large datasets of integers/strings with limited length.

---

### 🔹 9. **Bucket Sort**

**Idea:** Distribute elements into buckets, sort each bucket individually.
**Time Complexity:** O(n + k)
**When to Use:** Uniformly distributed data.

---

## Identifying Which Sort to Use

| Problem Type                   | Choose             | Reason                    |
| ------------------------------ | ------------------ | ------------------------- |
| Nearly sorted array            | **Insertion Sort** | Simple and adaptive       |
| Large dataset, stable required | **Merge Sort**     | Stable, predictable       |
| Large dataset, fast average    | **Quick Sort**     | Fast in practice          |
| Memory constrained             | **Heap Sort**      | In-place                  |
| Small range integers           | **Counting/Radix** | Non-comparison            |
| Floating-point, uniform data   | **Bucket Sort**    | Great average performance |

---

## Complexity Comparison Table

| Algorithm | Best        | Average     | Worst       | Space    | Stable | In-place |
| --------- | ----------- | ----------- | ----------- | -------- | ------ | -------- |
| Bubble    | O(n)        | O(n²)       | O(n²)       | O(1)     | ✅      | ✅        |
| Selection | O(n²)       | O(n²)       | O(n²)       | O(1)     | ❌      | ✅        |
| Insertion | O(n)        | O(n²)       | O(n²)       | O(1)     | ✅      | ✅        |
| Merge     | O(n log n)  | O(n log n)  | O(n log n)  | O(n)     | ✅      | ❌        |
| Quick     | O(n log n)  | O(n log n)  | O(n²)       | O(log n) | ❌      | ✅        |
| Heap      | O(n log n)  | O(n log n)  | O(n log n)  | O(1)     | ❌      | ✅        |
| Counting  | O(n + k)    | O(n + k)    | O(n + k)    | O(k)     | ✅      | ❌        |
| Radix     | O(d(n + k)) | O(d(n + k)) | O(d(n + k)) | O(n + k) | ✅      | ❌        |
| Bucket    | O(n + k)    | O(n + k)    | O(n²)       | O(n + k) | ✅      | ❌        |

---

## Sorting in Problem Patterns

| Pattern                         | Example Problems               | Technique Used               |
| ------------------------------- | ------------------------------ | ---------------------------- |
| **Two Pointers after Sorting**  | 3Sum, 4Sum                     | Sort + fix one + move ends   |
| **Greedy after Sorting**        | Job Scheduling, Interval Merge | Sort by key (end/start time) |
| **Binary Search after Sorting** | Search Range, Aggressive Cows  | Sort first                   |
| **Sorting + Hashing**           | Group Anagrams                 | Sort characters in word      |
| **Sorting + Prefix**            | Minimum Difference, Subset Sum | Sort and scan                |

---

## Competitive Programming Sorting Tips

1. **Know your sort limit** → `O(n log n)` for up to `10^6` elements.
2. **Avoid recursion limits** → Use `heap sort` for safety in C++/Java.
3. **Use built-in sort smartly**:

   * `Arrays.sort()` in Java → Dual-Pivot QuickSort (primitives), TimSort (objects).
   * `std::sort()` in C++ → IntroSort (Quick + Heap + Insertion).
4. **Understand TimSort (used in Python/Java)** → Hybrid of Merge + Insertion.
5. **Optimize custom comparators** → Avoid string/long operations in inner loops.

---

## Quick Revision Cheatsheet

```
Bubble — adjacent swap — O(n²)
Selection — min select — O(n²)
Insertion — place correctly — O(n²)
Merge — divide & merge — O(n log n)
Quick — pivot partition — O(n log n)
Heap — build heap — O(n log n)
Counting — frequency count — O(n + k)
Radix — digit-wise sort — O(d*(n + k))
Bucket — range bucket — O(n + k)
```

---
