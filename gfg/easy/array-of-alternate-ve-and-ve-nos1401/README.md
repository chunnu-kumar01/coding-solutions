# Alternate Positive Negative

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an unsorted array  **arr** containing both positive and negative numbers. Your task is to rearrange the array and convert it into an array of alternate positive and negative numbers without changing the relative order.

 **Note:** 

- Resulting array should start with a positive integer (0 will also be considered as a positive integer).
- If any of the positive or negative integers are exhausted, then add the remaining integers in the answer as it is by maintaining the relative order.

 **Examples:** 

```
Input: arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2]
Output: [9, -2, 4, -1, 5, -5, 0, -3, 2]
Explanation: The positive numbers are [9, 4, 5, 0, 2] and the negative integers are [-2, -1, -5, -3]. Since, we need to start with the positive integer first and then negative integer and so on (by maintaining the relative order as well), hence we will take 9 from the positive set of elements and then -2 after that 4 and then -1 and so on.

```

```
Input: arr[] = [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
Output: [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
Explanation : The positive numbers are [5, 2, 4, 7, 1, 8, 0] and the negative integers are [-5,-2,-8]. According to the given conditions we will start from the positive integer 5 and then -5 and so on. After reaching -8 there are no negative elements left, so according to the given rule, we will add the remaining elements (in this case positive elements are remaining) as it in by maintaining the relative order.
```

```
Input: arr[] = [9, 5, -2, -1, 5, 0, -5, -3, 2]
Output: [9, -2, 5, -1, 5, -5, 0, -3, 2]
Explanation: The positive numbers are [9, 5, 5, 0, 2] and the negative integers are [-2, -1, -5, -3]. Since, we need to start with the positive integer first and then negative integer and so on (by maintaining the relative order as well), hence we will take 9 from the positive set of elements and then -2 after that 5 and then -1 and so on.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T17:40:03.518Z  

```java
class Solution {
	void rearrange(ArrayList<Integer> arr) {
		// code here
		
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		
		for (int nums :arr) {
			
			if (nums >= 0) {
				pos.add(nums);
			}
			else {
				neg.add(nums);
			}
		}
		
		int index = 0;
		int i = 0;
		
		while (i<pos.size() && i<neg.size()) {
			
			arr.set(index++, pos.get(i));
			arr.set(index++, neg.get(i));
			
			i++;
			
		}
		
		while (i<pos.size()) {
			arr.set(index++, pos.get(i++));
			
		}
		
		while (i<neg.size()) {
			arr.set(index++, neg.get(i++));
		}
		
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1)