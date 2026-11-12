# Reverse Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers  **arr[]**, reverse the array in place.

**Examples:
**

```
Input: arr = [1, 4, 3, 2, 6, 5]
Output: [5, 6, 2, 3, 4, 1]
Explanation: The elements of the array are [1, 4, 3, 2, 6, 5]. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. Hence, the answer is [5, 6, 2, 3, 4, 1].
```

```
Input: arr = [4, 5, 2]
Output: [2, 5, 4]
Explanation: The elements of the array are [4, 5, 2]. The reversed array will be [2, 5, 4].

```

```
Input: arr = [1]
Output: [1]
Explanation: The array has only single element, hence the reversed array is same as the original.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T19:07:00.391Z  

```java
class Solution {
	public void reverseArray(int arr[]) {
		// code here
		int n = arr.length;
		int i = 0, j = n - 1;
		
		while (i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-an-array/1)