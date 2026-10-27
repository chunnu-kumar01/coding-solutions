# Selection Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**, use selection sort to sort arr[] in increasing order.

 **Examples :** 

```
Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: Maintain sorted (in bold) and unsorted subarrays. Select 1. Array becomes 1 4 3 9 7. Select 3. Array becomes 1 3 4 9 7. Select 4. Array becomes 1 3 4 9 7. Select 7. Array becomes 1 3 4 7 9. Select 9. Array becomes 1 3 4 7 9.
```

```
Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

```

```
Input: arr[] = [38, 31, 20, 14, 30]
Output: [14, 20, 30, 31, 38]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T08:39:24.373Z  

```java
class Solution {
	void selectionSort(int[] arr) {
		// code here
		int n = arr.length;
		
		for (int i = 0; i<n; i++) {
		int	min = i;
			
			for (int j = i + 1; j<n; j++) {
				if (arr[j]<arr[min]) {
					min = j;
					
				}
			}
				
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
				
			
		}
	}
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/selection-sort/1)