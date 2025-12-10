# Linked List

## What is it?

A linked list maintains:
- Head pointer → first node
- (Optional) Tail pointer → last node
- Each node points to the next (and optionally previous) node.
- Linked lists cannot be indexed

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
- Insert/delete at head is `O(1)`
- Insert/delete at tail is `O(1)` only if you maintain a tail pointer
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
- Insert/delete is `O(1)` if you already have node reference (because you can access prev and next immediately)
- Slightly more memory due to extra pointer
- Simpler deletion of any node without needing previous pointer from traversal

Use cases:
Browser history, LRU cache, text editors, double-ended queue implementations


## Patterns

### Reverse Linked List

Used for:
- Palindrome checking
- Reversing list or part of list
- Adding two numbers in correct order
- Undo style operations

#### Iterative approach

``` java

ListNode prev = null;
ListNode curr = head; // points to head node

while(curr != null) {
    // obtain the reference to it's next node
    ListNode next = curr.next;

    // isolate and append to prev reference
    curr.next = prev;
    prev = curr;

    // make the curr to the next node
    curr = next;
}

```
#### Recursive Approach

``` java

// base condition
if(head == null || head.next == null) return head;

ListNode newHead = reverseList(head.next);

head.next.next = head; // make the pointer to point to head
head.next = null; // make the head's reference as null

return newHead;

```

### Two-Pointer (Fast–Slow) Pattern

Two pointers let you “simulate” relative positions in one traversal.
Uses slow and fast pointers to move.

Used for:

- Find middle
- Detect cycle*
- Find cycle start*
- Check palindrome
- Remove nth from end

``` java

ListNode slow = head, fast = head;

while(fast != null && fast.next != null ) {
    fast = fast.next.next; // move 2 nodes
    slow = slow.next; // move 1 node
}

```

### Dummy Node Pattern

Prevents edge-case bugs when modifying head.

Used for:

- Delete node
- Insert node
- Remove nth from end
- Partition lists
- Reordering lists

``` java

ListNode dummy = new ListNode(-1); // create a dummy node
// some code needed
return dummy.next; // returns the result altered node

```

### Floyd's Cycle Detection

Used for:
- detect the cycle
- count the length of cycle
- starting point of the cycle

``` java

// find if that's a loop
if (head == null)
    return 0;

ListNode slow = head, fast = head;
boolean isCycle = false;

// detect the cycle
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    if (slow == fast) {
        isCycle = true;
        break;
    }
}

// if that is not cycle return 0
if (!isCycle)
    return 0;

// find start of cycle
while (slow != fast) {
    slow = slow.next;
    fast = fast.next;
}

// both slow and fast are at starting point
// traverse only the fast for one cycle
int count = 1;
fast = fast.next;
while (slow != fast) {
    ++count;
    fast = fast.next;
}

// we now know the count
return count;

```