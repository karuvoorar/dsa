# Hashing

---

## What Is Hashing

Hashing is a technique to map data of arbitrary size to fixed-size values called *hashes*.
The goal is fast lookup, insertion, and deletion — ideally in **O(1)** average time.

A hash function converts input (key) → hash code → index in a hash table.

### Example

| Key | Hash Function Output | Index in Table |
| --- | -------------------- | -------------- |
| 10  | 10 % 5 = 0           | 0              |
| 22  | 22 % 5 = 2           | 2              |
| 31  | 31 % 5 = 1           | 1              |

---

## Why Use Hashing

**Advantages:**

* Fast access: O(1) average time for **lookup**, **insert**, **delete**
* Avoids sorting/search overhead
* Common uses:

  * Counting frequency (e.g., anagram check)
  * Detecting duplicates
  * Caching results
  * Set operations (union, intersection)
  * Indexing (databases, compilers)

---

## Types of Hashing

| Type              | Description                        | Example Use                       |
| ----------------- | ---------------------------------- | --------------------------------- |
| Direct Addressing | Small key range, map directly      | Count[26] for lowercase letters   |
| Modular Hashing   | key % table_size                   | Integer key hashing               |
| String Hashing    | Convert characters → numeric value | Pattern searching (Rabin–Karp)    |
| Custom Hashing    | User-defined function               | Complex keys (e.g. pairs, tuples) |

---

## Hash Collisions

Two keys can map to the same hash index.

**Collision Handling Techniques:**

1. **Chaining:** store a list at each index
2. **Open Addressing:**

   * Linear Probing: `index = (hash + i) % size`
   * Quadratic Probing: `index = (hash + i²) % size`
   * Double Hashing: use a second hash function for jumps

---

## Hashing Data Types

### Integers

**Common Hash Function:**

```java
index = key % table_size;
```

#### Example: Counting frequencies

```java
int[] nums = {1, 2, 2, 3, 1};
HashMap<Integer, Integer> freq = new HashMap<>();

for (int num : nums)
    freq.put(num, freq.getOrDefault(num, 0) + 1);

System.out.println(freq); // {1=2, 2=2, 3=1}
```

Use cases: frequency counting, duplicates detection, prefix sums, pair sums.

---

### Characters

Direct hashing works well when the character set is small (like 26 letters).

```java
int[] count = new int[26];
String s = "abca";

for (char c : s.toCharArray())
    count[c - 'a']++;

System.out.println(Arrays.toString(count)); 
// [2,1,1,0,0,...]
```

Use cases: anagram checking, palindrome checks, frequency-based questions.

---

### Strings

String hashing converts a string to an integer hash value.

#### Example: Polynomial Rolling Hash

For string `"abc"`,
hash = (a * p² + b * p¹ + c * p⁰) % M

```java
long hash = 0, p = 31, pow = 1, mod = 1_000_000_007;
String s = "abc";

for (int i = 0; i < s.length(); i++) {
    hash = (hash + (s.charAt(i) - 'a' + 1) * pow) % mod;
    pow = (pow * p) % mod;
}
System.out.println(hash);
```

Use cases: substring matching (Rabin–Karp), rolling hash, dictionary lookups.

---

## Hashing Patterns in Problems

### Pattern: Frequency Counting

Find the element that appears once while others appear twice.

```java
int[] arr = {1,2,3,2,1};
HashMap<Integer, Integer> map = new HashMap<>();
for (int n : arr) map.put(n, map.getOrDefault(n, 0) + 1);
for (int n : arr)
    if (map.get(n) == 1)
        System.out.println(n);
```

When a problem mentions *“count”, “unique”, “most frequent”* → think hashing.

---

### Pattern: Two Sum

Find indices `i`, `j` such that nums[i] + nums[j] == target

```java
int[] nums = {2,7,11,15};
int target = 9;
HashMap<Integer, Integer> map = new HashMap<>();

for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];
    if (map.containsKey(complement)) {
        System.out.println("Indices: " + map.get(complement) + ", " + i);
    }
    map.put(nums[i], i);
}
```

When you see “pair sum” or “matching complement” → hash the first element and check the second.

---

### Pattern: Subarray with Given Sum

```java
int[] arr = {10, 2, -2, -20, 10};
int sum = -10;
Set<Integer> set = new HashSet<>();
int prefixSum = 0;

for (int n : arr) {
    prefixSum += n;
    if (prefixSum == sum || set.contains(prefixSum - sum))
        System.out.println("Found subarray");
    set.add(prefixSum);
}
```

Use prefix sums with hashing to check if `(prefixSum - target)` exists.

---

### Pattern: Group Anagrams

```java
String[] words = {"bat","tab","eat","tea","tan","nat"};
HashMap<String, List<String>> map = new HashMap<>();

for (String w : words) {
    char[] ch = w.toCharArray();
    Arrays.sort(ch);
    String key = new String(ch);
    map.computeIfAbsent(key, k -> new ArrayList<>()).add(w);
}

System.out.println(map.values());
```

When two strings differ by permutation → use sorted string or frequency count as hash key.

---

### Pattern: Detect Duplicates

```java
int[] nums = {1, 2, 3, 1};
HashSet<Integer> set = new HashSet<>();
for (int n : nums) {
    if (!set.add(n)) {
        System.out.println("Duplicate: " + n);
    }
}
```

When you only need presence/absence information → use a `HashSet`.

---

## Advanced Ideas

| Technique      | Description                                    | Example Use             |
| -------------- | ---------------------------------------------- | ----------------------- |
| Double Hashing | Use two hash functions to reduce collisions    | Competitive programming |
| Rehashing      | Resize and redistribute when load > threshold  | HashMap internals       |
| Custom Objects | Implement `hashCode()` and `equals()` properly | Map of (x,y) pairs      |

---

## Time and Space Complexity

| Operation | Average | Worst (Heavy Collisions) |
| --------- | ------- | ------------------------ |
| Insertion | O(1)    | O(n)                     |
| Deletion  | O(1)    | O(n)                     |
| Search    | O(1)    | O(n)                     |

---

## Common Pitfalls

* Forgetting to override `hashCode()` and `equals()` for custom objects
* Using mutable or floating-point keys
* Assuming order in HashMap (use LinkedHashMap if needed)
* Ignoring collision handling in theoretical questions

---

## Practice Problem Set

| Level  | Problem                      | Concept                       |
| ------ | ---------------------------- | ----------------------------- |
| Easy   | Two Sum                      | Complement search             |
| Easy   | Contains Duplicate           | HashSet                       |
| Medium | Subarray Sum Equals K        | Prefix sum + HashMap          |
| Medium | Group Anagrams               | String hashing                |
| Hard   | Longest Consecutive Sequence | HashSet traversal             |
| Hard   | Count Distinct Substrings    | String hashing + rolling hash |

---

## Learning Roadmap

1. Start small: Count frequencies of integers and characters
2. Move to problems like Two Sum and Subarray Sum
3. Learn collision handling and chaining
4. Understand String Hashing (Rabin–Karp)
5. Study how `hashCode()` and `equals()` work in Java
6. Solve prefix-hash and substring problems

---

## Quick Summary

| Topic             | Key Concept                       | Example               |
| ----------------- | --------------------------------- | --------------------- |
| Integer hashing   | `key % size`                      | frequency count       |
| Character hashing | direct mapping                    | `count[c-'a']`        |
| String hashing    | polynomial rolling                | Rabin–Karp            |
| Pattern           | frequency, complement, prefix sum | Two Sum, Subarray Sum |
| Data structure    | `HashMap`, `HashSet`              | all use cases         |

---
