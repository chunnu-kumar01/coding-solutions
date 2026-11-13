# Adding One to Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a non-negative integer(without leading zeroes) represented as an array  **arr**. Your task is to add  **1**  to the number (increment the number by 1). The digits are stored such that the most significant digit is at the starting index of the array.

 **Examples:** 

```
Input: arr[] = [5, 6, 7, 8]
Output: [5, 6, 7, 9]
Explanation: 5678 + 1 = 5679
```

```
Input: arr[] = [9, 9, 9]
Output: [1, 0, 0, 0]
Explanation: 999 + 1 = 1000

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T17:45:33.730Z  

```java
class Solution {
	ArrayList<Integer> addOne(int[] arr) {
		// code here
		int n = arr.length;
		ArrayList<Integer> ans = new ArrayList<>();
		int carry = 1;
		
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i]+carry <= 9) {
				ans.add(arr[i]+carry);
				carry = 0;
			}
			else {
				ans.add(0);
				carry = 1;
			}
			
		}if(carry==1)ans.add(carry);
			Collections.reverse(ans);
		return ans;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/adding-one2529/1)