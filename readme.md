<!-- # Collection FrameWork Section

$$
\text{Collection Frameworks Ends}
$$


 -->

# Objective Type Compilation


**Q1**: Which of the following is NOT a characteristic of a trie data structure?  
**Ans**: It has a time complexity of O(log n).  



**Q2**: Which of the following is the best-suited data structure for implementing a priority queue?  
**Ans**: Heap  



**Q3**: Which of the following statements is true for a Min-Heap?  
**Ans**: The parent node is always smaller than the child nodes.  



**Q4**: Which algorithm is optimal for finding the shortest path in a graph with both negative and positive edge weights?  
**Ans**: Bellman-Ford Algorithm  



**Question 5**
**Pseudocode:**
```plaintext
Procedure Test(x, y)
    Begin
    If x <= 0 Then
        Print x + y
    Else
        Call Test(x - 1, y + 2)
    End If
    End
Begin
    Call Test(3, 2)
End
```

The `Test` procedure recursively decrements `x` by 1 and increments `y` by 2 until `x` becomes 0 or less.  
- Call 1: `Test(3, 2)` → Calls `Test(2, 4)`  
- Call 2: `Test(2, 4)` → Calls `Test(1, 6)`  
- Call 3: `Test(1, 6)` → Calls `Test(0, 8)`  
- Call 4: `Test(0, 8)` → Prints `0 + 8 = 8`.  

**Output:** `8`



**Q6**: Which graph is represented by an adjacency matrix of size $V \times V$?  
**Ans**: Dense graph  



**Question 7**
**Pseudocode:**
```plaintext
Procedure CountUp(n)
   Begin
   If n > 0 Then
        Call CountUp(n - 1)
        Print n
     End If
   End
Begin
    Call CountUp(3)
End
```
**Ans**: 1 2 3  



**Q8**: Technique used to balance a binary search tree?  
**Ans**: Rotations  



**Q9**: Space complexity of a recursive function using a call stack in a tree traversal?  
**Ans**: $O(\log n)$  



**Question 10**
**Pseudocode:**
```plaintext
n = 5
k = 3
i = 1
WHILE i <= n
    IF i MOD k = 0 THEN
        PRINT i
    i = i + 1
```
**Ans**: 3  



**Q11**: Time complexity of searching in a hash table using separate chaining?  
**Ans**: $O(1)$  



**Q12**: **Pseudocode for intersection of two sorted arrays A and B**:
```
Procedure Intersect(A, B):
    i = 0, j = 0
    While i < n and j < m:
        If A[i] == B[j]:
            Print A[i]
            i = i + 1
            j = j + 1
        Else If A[i] < B[j]:
            i = i + 1
        Else:
            j = j + 1
End
```



**Q13**: True statement regarding Binary Search Trees (BST)?  
**Ans**: A BST requires a maximum of $O(\log n)$ time for insertion, deletion, and searching.  



**Q14**: Time complexity of finding LCA of two nodes in a BST?  
**Ans**: $O(\log n)$  



**Q15**: Which is a non-comparison-based sorting algorithm?  
**Ans**: Counting Sort  



**Q16**: Time complexity of deleting an element from a balanced BST?  
**Ans**: $O(\log n)$  



**Q17**: Algorithm used to find MST of a graph?  
**Ans**: Kruskal's Algorithm  



**Q18**: Data structure efficient for implementing "first-come, first-served" scheduling?  
**Ans**: Queue  



**Q19**: **Pseudocode to reverse a list**:
```
Procedure ReverseList(List):
    Start = 0, End = Length(List) - 1
    While Start < End:
        Swap(List[Start], List[End])
        Start = Start + 1
        End = End - 1
End
```



**Question 20**
**Pseudocode:**
```plaintext
x = 2
y = 3
WHILE x <= y
    x = x + 1
PRINT x
``` 
**Ans**: 4  



**Question 21**
**Pseudocode:**
```plaintext
x = 1
y = 1
z = 0
FOR i = 1 TO 5
    x = x + y
    y = y + z
    z = z + 1
PRINT x, y, z
``` 
**Ans**: 8, 6, 5  



**Question 22**
**Pseudocode:**
```plaintext
Procedure SumEven(n)
    Begin
    If n = 0 Then
        Print 0
    Else If n % 2 = 0 Then
        Print n
        Call SumEven(n - 2)
    Else
        Call SumEven(n - 1)
    End If
    End
Begin
    Call SumEven(6)
End
```
**Ans**: 6 4 2 0  



**Q23**: Which is NOT a stable sorting algorithm?  
**Ans**: Quick Sort  



**Q24**: Example of a greedy algorithm?  
**Ans**: Dijkstra's Algorithm  



**Q25**: Data structure most suitable for solving the "interval scheduling problem"?  
**Ans**: Heap  



**Question 26**
**Pseudocode:**
```plaintext
Procedure Reverse(n)
    Begin
    If n = 0 Then
        Print "Done"
    Else
        Print n
        Call Reverse(n - 1)
    End If
    End
Begin
    Call Reverse(3)
End
```
**Ans**: 3 2 1 Done  



**Q27**: **Pseudocode to find the second largest number in an unsorted array**:
```
Procedure SecondLargest(A, n):
    Largest = -∞, SecondLargest = -∞
    For Each Element in A:
        If Element > Largest:
            SecondLargest = Largest
            Largest = Element
        Else If Element > SecondLargest and Element != Largest:
            SecondLargest = Element
    Print SecondLargest
End
```


$$
\text{Objective Type Ends}
$$






$$
\Large\text{End of file}
$$