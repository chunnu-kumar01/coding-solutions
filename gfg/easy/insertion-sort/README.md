# Insertion Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]** of positive integers.The task is to complete the  **insertsort()**  function which is used to implement Insertion Sort.

 **Examples:** 

```
Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: The sorted array will be [1, 3, 4, 7, 9].
```

```
Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Explanation: The sorted array will be [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
```

```
Input: arr[] = [4, 1, 9]
Output: [1, 4, 9]
Explanation: The sorted array will be [1, 4, 9].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T08:53:47.231Z  

```java
class Solution {
	// Please change the array in-place
	public void insertionSort(int arr[]) {
		// code here
		int n = arr.length;
		
		for (int i = 1; i<n; i++) {
			
			int el = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > el)	{
				
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[j + 1] = el;
			
		}
		
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/insertion-sort/1)