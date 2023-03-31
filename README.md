# Here Competition

## Task 1
Immutability is a concept that something can't be changed after its creation.
Creating an immutable class in Java is easy. I used to variants.
First uses java record with function-like getters' syntax.
Second just uses all-args constructor and getters using lombok.

## Task 2
I implemented quick sort using special class having one single static method.
Array is indeed sorted in place, which means that memory complexity for this task is O(1) (constant).
The time complexity is O(n*log(n)) which is a standard for a good sorting algorithm.
It is produced by breaking down array into sub-arrays in exponential manner, and in each breaking
iterating it and swapping elements.

## Task 3
I implemented binary search to efficiently perform searching.
Time complexity is O(log(n)). This is standard approach.

## Task 4
Json Abstract Syntax Tree implementation. Json AST is a way of structuring a json document,
so it's more readable from the perspective running a parsing script.
I created complete set of classes representing the required types.

## Task 5
Calculated directory size assuming that a directory can contain both files and another directories.
This lookup is performed using recursion and calculation with mapping is done using stream API.

## Task 6
There are several ways one can approach this task.
The first approach is to create just the TreeNode class and after building a tree structure,
pass its root to the function. I used this approach as it is more 'raw'
and does not create any additional overhead.
The time complexity is linear = O(n) as the algorithm has to visit all the nodes.
Another way to approach this is to create custom tree class that uses TreeNode and keep the height of the tree updated.
This will result in very fast (constant time) height value access but requires creating a wrapper.

