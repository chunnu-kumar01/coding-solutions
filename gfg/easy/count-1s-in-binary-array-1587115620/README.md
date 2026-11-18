# Count 1's in binary array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a binary array that is  **sorted**  in  **non-increasing**  order, meaning all the  **1's**  appear before the  **0's**. Find the total number of `1'`s present in the array.

 **Examples:** 

```
Input: arr[] = [1, 1, 1, 1, 1, 0, 0, 0]
Output: 5
Explaination: Count of 1's in the array is 5.

```

```
Input: arr[] = [1, 1, 1, 1, 1, 1, 1]
Output: 7
Explaination: Count of 1's in the array is 7.

```

**Constraints:
**1 ≤ arr.size() ≤ 105 
0 ≤ arr[i] ≤ 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T08:44:52.374Z  

```java
class Solution {
	public int countOnes(int[] arr) {
		// code here
		
		int l = 0;
		int r = arr.length - 1;
		int ans = r + 1;
		
		while (l <= r) {
			int mid = l + (r - l)/2;
			
			if (arr[mid] == 1) {
				l = mid + 1;
			}
			else {
				ans = mid;
				r = mid - 1;
			}
		}
		
		return ans;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-1s-in-binary-array-1587115620/1)