# Rotate Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**. Rotate the array to the left (counter-clockwise direction) by  **d**  steps, where  *d*  is a positive integer. Do the mentioned change in the array in place.

 **Note:** Consider the array as circular.

**Examples :
**

```
Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes [3, 4, 5, 1, 2].
```

```
Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes [8, 10, 12, 14, 16, 18, 20, 2, 4, 6].

```

```
Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get [3, 9, 1, 7] as resultant array.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T19:33:44.712Z  

```java
class Solution {
	
	public void rotateArr(int arr[], int d) {
		// code here
		
		int n = arr.length;
		d = d%n;
		
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);
		
	}
	
	static void reverse(int []arr, int i, int j) {
		
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

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1)