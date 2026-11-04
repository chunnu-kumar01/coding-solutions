# Check Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**, check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

 **Examples:** 

```
Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.
```

```
Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T19:03:20.573Z  

```java
class Solution {
	public boolean isSorted(int[] arr) {
		// check ascending order
		int n=arr.length;
		boolean asd = true;
		
		for (int i = 0; i<n-1; i++) {
			if (arr[i]>arr[i + 1]) {
				asd = false;
				break;
			}
		}
		
		boolean dsd = true;
		
		for (int i = 0; i<n-1; i++) {
			if (arr[i]<arr[i + 1]) {
				dsd = false;
				break;
			}
		}
		
		return asd || dsd;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1)