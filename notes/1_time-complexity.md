# Types of Time Complexity Functions

Understanding common time complexities in algorithm analysis:

| Notation | Name | Description |
|-----------|------|--------------|
| **O(1)** | Constant | Execution time does not depend on the input size. |
| **O(log n)** | Logarithmic | Time increases slowly as input size grows (e.g., binary search). |
| **O(n)** | Linear | Time grows directly with input size. |
| **O(n²)** | Quadratic | Time grows proportional to the square of input size (e.g., bubble sort). |
| **O(n³)** | Cubic | Time grows proportional to the cube of input size (e.g., triple nested loops). |
| **O(2ⁿ)** | Exponential | Time doubles with each additional input element (e.g., recursive Fibonacci). |

---

### 🔍 Quick Summary

| Growth Rate | Example Algorithm | Performance |
|--------------|------------------|--------------|
| **O(1)** | Accessing array element | 🚀 Fastest |
| **O(log n)** | Binary Search | ⚡ Very Efficient |
| **O(n)** | Linear Search | ⚙️ Moderate |
| **O(n²)** | Bubble Sort | 🐢 Slow for large data |
| **O(n³)** | Matrix Multiplication | 🐌 Slower |
| **O(2ⁿ)** | Recursive Fibonacci | 💀 Extremely Slow |

---

📘 *Tip:* When analyzing algorithms, always aim for **O(log n)** or **O(n)** if possible!

---

## Asymptotic Notations

| Notation | Meaning | Description |
|-----------|----------|-------------|
| **Big O (O)** | Upper Bound | Represents the worst-case growth rate of an algorithm. |
| **Big Omega (Ω)** | Lower Bound | Represents the best-case growth rate of an algorithm. |
| **Theta (Θ)** | Tight Bound | Represents the average or exact growth rate (when both upper and lower bounds are the same). |

---

## 📘 Master Theorem — Recurrence Relations and Time Complexities

The **Master Theorem** helps determine the time complexity of divide-and-conquer algorithms expressed as recurrences.

A general recurrence looks like this:

> **T(n) = a·T(n/b) + f(n)**
> where
> - `a` → number of subproblems
> - `b` → factor by which the problem size is divided
> - `f(n)` → extra work done outside recursion (like merging or partitioning)

---

### 🔹 Common Recurrence Relations and Their Complexities

| Recurrence Relation | Description | Time Complexity |
|----------------------|--------------|-----------------|
| **T(n) = T(n - 1) + 1** | Reduces problem size by 1 each time (like linear recursion) | **O(n)** |
| **T(n) = T(n/2) + 1** | Divide problem in half each time (binary recursion) | **O(log n)** |
| **T(n) = 2T(n/2) + 1** | Two subproblems of half size each (like merge sort) | **O(n)** |
| **T(n) = 2T(n/2) + n** | Two halves + linear merge work (merge sort exactly) | **O(n log n)** |
| **T(n) = 3T(n/2) + n** | Three subproblems, half size each | **O(n^log₂3)** ≈ **O(n^1.585)** |
| **T(n) = T(n/2) + n** | One subproblem + linear extra work | **O(n)** |
| **T(n) = 2T(n/2) + n²** | Two subproblems + quadratic combination | **O(n²)** |
| **T(n) = T(n - 1) + n** | Linear reduction + linear work each step | **O(n²)** |
| **T(n) = 2T(n - 1) + 1** | Each call doubles recursive work | **O(2ⁿ)** |
| **T(n) = T(n/2) + log n** | Divide by half + logarithmic work | **O(log² n)** |
| **T(n) = 2T(n/2) + √n** | Two halves + root-n extra work | **O(n)** (since √n < n^log₂2 = n) |

---

### 🧠 Quick Intuition

| Pattern | Growth | Example Algorithm |
|----------|---------|------------------|
| **T(n) = T(n - 1) + 1** | Linear | Linear recursion (simple loops, factorial) |
| **T(n) = T(n/2) + 1** | Logarithmic | Binary Search |
| **T(n) = 2T(n/2) + n** | Linearithmic | Merge Sort, Quick Sort (avg) |
| **T(n) = 2T(n/2) + n²** | Quadratic | Complex merging operations |
| **T(n) = T(n - 1) + n** | Quadratic | Insertion Sort |
| **T(n) = 2T(n - 1) + 1** | Exponential | Recursive Fibonacci |
| **T(n) = T(n/2) + log n** | Log² growth | Divide-and-conquer with log work |
| **T(n) = 3T(n/2) + n** | Superlinear | Strassen’s Matrix Multiplication |

---

📘 *Tip:*
When comparing recurrences, focus on whether the **subproblem count (a)** or the **work outside recursion (f(n))** dominates.
The Master Theorem simplifies identifying which one controls the total growth.

