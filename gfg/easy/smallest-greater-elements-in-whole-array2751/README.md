# Smallest Greater in Whole Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**, for each element, find the smallest element in the array that is strictly greater than it. If no such element exists, return -10000000 for that position. Return the resulting array.

 **Examples:** 

```
Input : arr[] = [13, 6, 7, 12]
Output : -10000000 7 12 13 
Explanation: Here, at index 0, 13 is the greatest value in given array and no other array element is greater from 13. So at index 0 we fill '-10000000'.

```

```
Input : arr[] = [6, 3, 9, 8, 10, 2, 1, 15, 7]
Output :  7 6 10 9 15 3 2 -10000000 8
Explanation: Here, at index 7, 15 is the greatest value in given array and no other array element is greater from 15. So at index 7 we fill '-10000000'.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T10:51:14.087Z  

```java
class Solution {
	
	int solve(int el, int [] arr) {
		int start = 0;
		int end = arr.length - 1;
		int ans = -10000000;
		
		while (start <= end)
			{
			
			int mid = start + (end - start)/2;
			
			if (arr[mid]>el)
				{
				ans = arr[mid];
				end = mid - 1;
				
			}
			else {
				start = mid + 1;
				
			}
		}
		return ans;
	}
	
	public ArrayList<Integer> greaterElement(int[] arr) {
		
		int [] new_arr = new int [arr.length];
		int n = arr.length;
		for (int i = 0; i<n; i++) {
			new_arr[i] = arr[i];
			
		}
		
		Arrays.sort(new_arr);
		
		ArrayList <Integer> ans = new ArrayList <>();
		
		for (int i = 0; i<n; i++) {
			int el = arr[i];
			int greater = solve(el, new_arr);
			ans.add(greater);
		}
		return ans;
		
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-greater-elements-in-whole-array2751/1)