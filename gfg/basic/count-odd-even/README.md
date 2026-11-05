# Count Odd and Even

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]** of positive integers. The task is to return the count of the number of  **odd** and  **even** elements in the array.

Note: Return two elements where the first one in the count of odd & second one is the count of even.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: 3 2
Explanation: There are 3 odd elements (1, 3, 5) and 2 even elements (2 and 4).
```

```
Input: arr[] = [1, 1]
Output: 2 0
Explanation: There are 2 odd elements (1, 1) and no even elements.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T16:41:22.910Z  

```java
class Solution {
	public int[] countOddEven(int[] arr) {
		// Code here
		
		int n = arr.length;
		int evenCount = 0;
		int oddCount = 0;
		
		for (int i = 0; i<n; i++) {
			if (arr[i]% 2 != 0) {
				oddCount++;
			}
			else {
				evenCount++;
			}
			
		}
		
		return new int[]{oddCount, evenCount};
		
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-odd-even/1)