# Sorting Program

The program I have created sorts out any given array of integers of any different size into ascending order through 3 different methods, known as Bubble, Merge and Tree.

The Bubble method is a simple sorting algorithm that compares adjacent elements of an array and swaps them if the element on the right is smaller than the one on the left. If the first element is greater than the second element, they are swapped. Now, compare the second and the third elements. Swap them if they are not in order. The process goes on until the last element. The largest element among the unsorted elements is placed at the end. The array is sorted when all the unsorted elements are placed at their correct positions.

The Merge method is one of the most popular sorting algorithms that is based on the principle of Divide and Conquer Algorithm. The program works by first &quot;dividing&quot; the input array into 2 parts, calls itself for them, and then merges those two sorted halves. This process recursively occurs as every half of the array is again divided into two halves, sorted and merged.

The Tree method is an algorithm that is based on Binary Search Tree data structure. It first creates a binary search tree from the elements of the input list or array and then performs an in-order traversal on the created binary search tree to get the elements in sorted order. It works by taking the elements input in an array, creating a Binary search tree by inserting data items from the array into the binary search tree and finally, performing in-order traversal on the tree to get the elements in sorted order.

Here are some examples of the sort methods working within my project:

Bubbles:

![image](https://user-images.githubusercontent.com/60224152/178159141-6026f466-ee6c-47ee-b50b-a31b50ceec40.png)

Merge:

![image](https://user-images.githubusercontent.com/60224152/178159150-bd454b78-0fb0-4572-9171-f961dc1918d9.png)

Tree:

![image](https://user-images.githubusercontent.com/60224152/178159158-cd4c5979-a410-4633-81e9-a2c15ebadb51.png)
