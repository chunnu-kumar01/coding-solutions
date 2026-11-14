# Sort 0s, 1s and 2s

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  containing only 0s, 1s, and 2s **.**  Sort the array in ascending order. 

 **Examples:** 

```
Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
```

```
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
```

 **Follow up:**  Could you come up with a one-pass algorithm using only constant extra space?

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T19:20:01.795Z  

```java
class Solution {
	public void sort012(int[] arr) {
		int n = arr.length;
		int c0 = 0;
		int c1 = 0;
		int c2 = 0;
		int i = 0;
		
		while (i<n) {
			if (arr[i] == 0) {
				c0++;
				
			}
			else if (arr[i] == 1) {
				c1++;
			}
			else {
				c2++;
			}
			
			i++;
		}
		
		i = 0;
		while (i<c0) {
			arr[i++] = 0;
			
		}
		
		while (i<c0 + c1) {
		    
			arr[i++] = 1;
			
		}
		while (i<n) {
			arr[i++] = 2;
			
		}
		
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1)