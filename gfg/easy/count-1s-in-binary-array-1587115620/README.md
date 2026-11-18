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
**Submitted:** 2026-11-18T08:36:27.790Z  

```java
class Solution {
	public int countOnes(int[] arr) {
		// code here
		int n = arr.length;
		
		int ans = 0;
		
		for (int x:arr) {
			if (x == 1) {
				ans++;
			}
			
		}
		return ans;
	}
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-1s-in-binary-array-1587115620/1)