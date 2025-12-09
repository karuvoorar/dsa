# Linked List

## What is it?

A linked list maintains:
- Head pointer → first node
- (Optional) Tail pointer → last node
- Each node points to the next (and optionally previous) node.

Operations:
- Insert at head → `O(1)`
- Insert at tail → `O(1)` if tail pointer exists, else `O(n)`
- Delete/Find → `O(n)`
- Access at index → `O(n)`

## Usage
1. Stack/Queue
2. Browser
3. Switching Apps in mac via cmd + tab

## Singly Linked List

Each node has:

- data
- next pointer → points to the next node

``` txt
[data | next] -> [data | next] -> [data | next] -> null
```

Properties:
- One-way traversal
- Insert/delete at head is O(1)
- Insert/delete at tail is O(1) only if you maintain a tail pointer
- Cannot move backward
- Uses less memory than doubly linked list

Use cases:
Stacks, hash chaining, adjacency lists, streaming operations

## Doubly Linked List

Each node has:
- data
- next pointer
- prev pointer

``` txt
null <- [prev | data | next] <-> [prev | data | next] <-> [prev | data | next] -> null
```

Properties:
- Two-way traversal
- Insert/delete is O(1) if you already have node reference (because you can access prev and next immediately)
- Slightly more memory due to extra pointer
- Simpler deletion of any node without needing previous pointer from traversal

Use cases:
Browser history, LRU cache, text editors, double-ended queue implementations
